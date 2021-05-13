//Use while loop and create a program that calculates the average of the numbers between x and y. 
//x and y are the integers the user has to input.
package exercisethree;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an Integer Number for X: ");
		int x = input.nextInt();
		
		System.out.print("Enter an Integer Number for Y: ");
		int y = input.nextInt();
		
		int counter = 0;
		int sum = 0;
		
		while(counter <= 0) {
			sum = x + y;
			counter++;
		}
		
		int average = sum/2;
		
		System.out.println("Average of x and y = " + average);
		
		input.close();
		

	}

}
