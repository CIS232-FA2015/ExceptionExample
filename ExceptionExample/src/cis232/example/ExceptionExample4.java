package cis232.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.util.Scanner;

public class ExceptionExample4 {

	public static void main(String[] args) {
		String filename = "numbers.txt";

		try {
			File file = new File(filename);
			Scanner input = new Scanner(file);

			int total = 0;
			while (input.hasNextLine()) {
				total += Integer.parseInt(input.nextLine());
			}

			System.out.println("The total is: " + total);
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found!");
		} catch (NumberFormatException e) {
			System.out.println("The file has a non-number!");
		}
	}

}
