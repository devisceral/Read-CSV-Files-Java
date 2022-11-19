package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "c:\\temp\\in.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr); //From this variable, we already have access to read the file
			
//Read line by line
			
			String line = br.readLine(); //Reads a file up to the line break
			
//Read to end of file
//Why different from null? Because if reached the end of the file and i call the readLine(), it returns null
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				br.close();
				fr.close();				
			}
			catch (IOException e) {
				e.printStackTrace(); //To screen print all stackTrace errors to help me see what happened.
			}
		}

	}

}
