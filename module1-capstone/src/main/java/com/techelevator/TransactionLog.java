package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TransactionLog {

	private File logFile;
	public TransactionLog(String filePath) {
		this.logFile = new File(filePath);
	}
	public void logMessage (String message) {
		try(PrintWriter writer = new PrintWriter(new FileWriter(logFile, true))) {
			 writer.println(message);
		}
		catch(IOException e){
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
	}
}

