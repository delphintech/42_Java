package com.dabouab.model;

import java.io.PrintStream;
import java.io.IOException;

public class RedirectOutput {
	// ********** Field ********** //
	private final PrintStream	ps;
	private final PrintStream	out;

	// ********** Methods ********** //
	public	RedirectOutput(String filePath) throws RuntimeException {
		try {
			this.out = System.out;
			this.ps = new PrintStream(filePath);
			System.setOut(this.ps);
		} catch (IOException e) {
			throw new RuntimeException("Unable to create the report.", e);
		}
	}

	public void	close() {
		if (this.ps != null) {
			this.ps.close();
		}
		if (this.out != null) {
			System.setOut(this.out);
		}
	}
}