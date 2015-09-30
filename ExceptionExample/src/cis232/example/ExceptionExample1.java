package cis232.example;

public class ExceptionExample1 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3};
		
		int total = 0;
		for(int i = 0; i <= numbers.length; i++){
			total += numbers[i];
		}
		
		System.out.println(total);
	}

}
