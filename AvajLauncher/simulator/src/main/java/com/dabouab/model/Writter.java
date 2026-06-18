package com.dabouab.util;

import java.io.File;
import java.io.PrintStream;

public class RedirectOutput {
	// ********** Field ********** //
	private PrintStream		ps;

	// ********** Methods ********** //
	public	RedirectOutput(String filePath) throws RuntimeException {
		File	file;

		try {
			file = new File(filePath);
			// Create file or reset it
			if (!file.createNewFile();) {
				FileChannel.open(file, StandardOpenOption.WRITE).truncate(0).close();
			}
			this.ps = new PrintStream(filePath);
		} catch (IOException e) {
			trow new RuntimeException("Unable to create the report.", e);
		}
	}

	public	stop() {
		if (this.ps != null) {
			this.ps.close();
		}
	}
}