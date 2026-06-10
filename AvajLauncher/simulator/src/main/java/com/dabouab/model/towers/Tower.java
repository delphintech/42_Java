package com.dabouab.model.towers;

import java.util.*;
import com.dabouab.model.flyables.Flyable

public class Tower {
	// ********** Field ********** //
	private final	List<Flyable>	observers = new ArrayList<Flyable>();

	// ********** Methods ********** //
	public void register(Flyable p_flyable) {
		if (p_flyable == null) return;

		if (!this.observers.contains(p_flyable)) {
			this.obervers.add(p_flyable);
		}
	}

	public void	unregister(Flyable p_flyable) {
		if (p_flyable == null) return;
		
		if (this.observers.contains(p_flyable))
			this.observers.remove(p_flyable);
	}

	protected void	conditionChanged() {
		// TODO
	}
}