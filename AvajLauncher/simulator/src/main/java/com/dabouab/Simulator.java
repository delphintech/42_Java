package com.dabouab;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

import com.dabouab.exception.*;
import com.dabouab.model.*;
import com.dabouab.model.flyables.*;

public class Simulator {
	public static void main(String[] args) {
		int				rounds;
		List<Flyable>	flyables = new ArrayList<Flyable>();


		if (args.length != 1) {
			System.err.println("The simulator takes the configuration file as argument");
			System.exit(1);
		}

		try (Parser parser = new Parser(args[0])) {
			rounds = parser.parseRounds();
			flyables = parser.parseFlyables();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}

		/* TODO
			Parse senario.txt
			Creates a Weather Tower
			Creates each Aircraft and register the WeatherTower (Flyable.registertower())
			Register all AirCraft in WeatherTower
			Runs loop with x weather changes
		 */
	}
}