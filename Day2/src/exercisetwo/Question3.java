//Write a Java program to get a number from the user and print whether it is positive or negative
package exercisetwo;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = input.nextInt();
		
		   if(num < 0)
		   {
			System.out.println("it is negative");
		}
		   else
		System.out.println("it is positive");
		   	
		   input.close();
	}
		
}	


  
