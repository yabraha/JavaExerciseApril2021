//Write a program that takes integer input ( 1 to 7)  from the a user ,1 representing Monday to 7 representing 
//Sunday. The program should decide whether the day input is a weekend or a weekday.(Use switch statement)

package exercisethree;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		{

	int day=input.nextInt();

	switch(day)
	{
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                
         	default:
         		System.out.println("Invalid number:");
       		}
       		if(day <=5) {
       			System.out.println("That's a Weekday");
       		}else if (day <=7) {
       			System.out.print("That's a Weekend");
       		}
       		input.close();
       		{
	}

	}
		}
	}


