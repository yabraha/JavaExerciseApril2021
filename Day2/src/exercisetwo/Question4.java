//Write Java program to allow the user to input his/her age. Then the program will show if the person 
//is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old.
package exercisetwo;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
	
	int age;
	Scanner check = new Scanner(System.in);
		System.out.print("Enter your age: ");
	age = check.nextInt();
	
	if (age >= 18)
		System.out.print("You are eligible to vote.");
	
	
	else if (age < 18)
	System.out.println("You are not eligible to vote");
	
		check.close();
	}

}
