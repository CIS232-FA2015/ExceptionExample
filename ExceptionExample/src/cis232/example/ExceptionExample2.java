package cis232.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args){
		File file = new File("imaginaryfile.txt");
		try {
			Scanner input = new Scanner(file);
			while(input.hasNextLine()){
				System.out.println(input.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("File was not found!");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program continuing...");
	}

}
