package com.dabouab;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

import com.dabouab.exception.*;
import com.dabouab.model.*;
import com.dabouab.model.flyables.*;
import com.dabouab.model.towers.WeatherTower;

public class Simulator {
	public static void main(String[] args) {
		int				rounds = 0;
		RedirectOutput	redir;
		WeatherTower	tower;
		List<Flyable>	flyables = new ArrayList<Flyable>();


		if (args.length != 1) {
			System.err.println("The simulator takes the configuration file as argument");
			System.exit(1);
		}

		try (Parser parser = new Parser(args[0])) {
			rounds = parser.parseRounds();
			// redir = new RedirectOutput("simulation.tx");
			parser.parseFlyables(flyables);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}

		tower = new WeatherTower();
		for (Flyable f : flyables) {
			f.registerTower(tower);
		}

		while (rounds > 0) {
			tower.changeWeather();
			rounds--;
		}

		// try {
		// 	redir.close()
		// } catch (IOException e) {
		// 	System.err.println(e.getMessage());
		// 	System.exit(1);
		// }
		System.exit(0);
	}
}