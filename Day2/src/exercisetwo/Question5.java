//Write a Java program which reads two integers from the user and
//prints the sum and difference both in their own line. 
package exercisetwo;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
	

			
		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter your number: ");
			
			
		int number1 = input.nextInt();
			
		System.out.println("Enter second number: ");
			
		int number2 = input.nextInt();
			
		int sum = number1+number2;
			
			System.out.println("sum: " + sum);
			
		int dif = number1-number2;
			System.out.println("defference : "+ dif);
	
				
				input.close();
	}

}
