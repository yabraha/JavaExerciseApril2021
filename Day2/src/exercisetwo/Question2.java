//Write a Java program to check if an input string starts with “T”. If it is start with “T” print 
//“Yes that is the string”, otherwise print “That is not the one”.
package exercisetwo;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

	
		Scanner check = new Scanner(System.in);{

		String name = "Tom";

		System.out.print("Eneter the first charcater: ");

		name = check.nextLine();

			if (name.startsWith("T")) 
			{
				System.out.println("Yes that is the string");
				
		}		
		else
		{
			System.out.println("No that is not the string");
			}
			
	}	
		check.close();
}
				
}
		
		


		

	

