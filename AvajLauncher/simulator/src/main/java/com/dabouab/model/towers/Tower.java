package com.dabouab.model.towers;

import java.util.*;
import com.dabouab.model.flyables.Flyable;
import com.dabouab.util.Color;

public class Tower {
	// ********** Field ********** //
	private final	List<Flyable>	observers = new ArrayList<Flyable>();

	// ********** Methods ********** //
	public void register(Flyable p_flyable) {
		if (p_flyable == null) return;

		if (!this.observers.contains(p_flyable)) {
			this.observers.add(p_flyable);
			String message = "📡 Tower says: %s registered to weather tower.";
			System.out.println(Color.GREEN + String.format(message, p_flyable) + Color.RESET);
		}
	}

	public void	unregister(Flyable p_flyable) {
		if (p_flyable == null) return;
		
		if (this.observers.contains(p_flyable)) {
			this.observers.remove(p_flyable);
			String message = "📡 Tower says: %s unregistered from weather tower.";
			System.out.println(Color.RED + String.format(message, p_flyable) + Color.RESET);
		}
	}

	protected void	conditionChanged() {
		for (Flyable flyable : observers) {
			flyable.updateConditions();
		}
	}
}