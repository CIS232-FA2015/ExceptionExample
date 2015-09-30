package cis232.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExample3 {

	public static void main(String[] args) {
		
		System.out.println("Input the name of a numbers file:");
		Scanner keyboard = new Scanner(System.in);
		
		String filename = keyboard.nextLine();
		Scanner input = getFileScanner(filename);
		while(input == null){
			System.out.println("That file does not exist, enter a different name:");
			filename = keyboard.nextLine();
			input = getFileScanner(filename);
		}
		
		int total = 0;
		while(input.hasNext()){
			try {
				total += Integer.parseInt(input.next());
			} catch (NumberFormatException e) {
				System.out.println("Skipping non-number");
			}
		}
		
		System.out.println("The total is: " + total);
		
		input.close();
	}
	
	public static Scanner getFileScanner(String filename){
		Scanner input = null;
		try{
			File file = new File(filename);
			input = new Scanner(file);
		}catch(FileNotFoundException e){
		}
		
		return input;
	}

}
