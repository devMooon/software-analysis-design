package hw.ch02;

import java.io.*;

public class Main {
    public static void main(String[] args) {
    	System.out.println("20200675 ¹®¼­¿¬");
    	
        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("Year", "2019");
            f.setValue("bornYear", "2001");
            f.setValue("StudentId", "20200675");
            f.setValue("Name", "MunSeoYeon");
            f.setValue("Location", "Jeonju");
            f.writeToFile("MunSeoYeon.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
