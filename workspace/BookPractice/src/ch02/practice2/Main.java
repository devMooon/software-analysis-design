package ch02.practice2;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileIO f = new FileProperties();
		try {
			f.readFromFile("file.txt");
			f.setValue("Year", "2001");
			f.setValue("month", "4");
			f.setValue("day", "21");
			f.writeToFile("newfile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
