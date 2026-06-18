package com.dabouab.model;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.IOException;

public class RedirectOutput {
	// ********** Field ********** //
	private PrintStream		ps;

	// ********** Methods ********** //
	public	RedirectOutput(String filePath) throws RuntimeException {
		File	file;

		try {
			file = new File(filePath);
			// Create file or reset it
			if (!file.createNewFile()) {
				FileWriter writer = new FileWriter(file, false);
				writer.write("");
				writer.close();
			}
			this.ps = new PrintStream(filePath);
		} catch (IOException e) {
			throw new RuntimeException("Unable to create the report.", e);
		}
	}

	public void	stop() {
		if (this.ps != null) {
			this.ps.close();
		}
	}
}