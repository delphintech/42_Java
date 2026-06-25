package com.dabouab.model;

import com.dabouab.model.flyables.Flyable;

import com.dabouab.exception.*;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Parser implements AutoCloseable {
    // ********** Field ********** //
    private File file;
    private BufferedReader br;

    // ********** Methods ********** //
    public Parser(String filePath) throws ConfigurationException {
        this.file = new File(filePath);
        try {
            this.br = new BufferedReader(new FileReader(this.file));
        } catch (IOException e) {
            throw new ConfigurationException("Cannot open scenario file: " + filePath, e);
        }
    }

    public int parseRounds() throws IOException, ConfigurationException {
        String line = this.br.readLine();
        try {
            int rounds = Integer.parseInt(line);
            if (rounds <= 0) {
                throw new ConfigurationException("Rounds must be positive");
            }
            return rounds;
        } catch (NumberFormatException e) {
            throw new ConfigurationException("Invalid rounds value", e);
        }
    }

    public void parseFlyables(List<Flyable> flyables) throws IOException, ConfigurationException {
        AircraftFactory factory;
        Coordinates coord;
        String line;
        String[] conf;
        int lon, lat, hei;

        factory = AircraftFactory.getInstance();
        while ((line = this.br.readLine()) != null) {
            conf = line.split(" ");
            if (conf.length != 5) {
                throw new ConfigurationException("Flyables must be defined with 5 parameters: TYPE NAME LONGITUDE LATITUDE HEIGHT");
            }

            try {
                lon = Integer.parseInt(conf[2]);
                lat = Integer.parseInt(conf[3]);
                hei = Integer.parseInt(conf[4]);
            } catch (NumberFormatException e) {
                throw new ConfigurationException("Coordinates must be positive numbers", e);
            }

            try {
                // System.out.println(lon + ", " + lat + ", " + hei);
                coord = new Coordinates(lon, lat, hei);
            } catch (CoordinatesException e) {
                throw new ConfigurationException("Coordinates must be positive and height in 0-100 range", e);
            }

            try {
                flyables.add(factory.newAircraft(conf[0], conf[1], coord));
            } catch (AircraftException e) {
                throw new ConfigurationException("Could not create the Aircraft with : " + line, e);
            }
        }
    }

    @Override
    public void close() throws IOException {
        if (this.br != null) {
            this.br.close();
        }
    }
}