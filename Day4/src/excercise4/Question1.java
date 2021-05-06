package excercise4;

public class Question1 {

	public static void main(String[] args) {
		//Write a Java program to calculate the average value of array integers.
		
		int[] myArray = new int[]{40, 50, 23, 35, 12};
	      
	       int sum = 0;
	       for(int i=0; i < myArray.length ; i++)
	        sum = sum + myArray[i];
	     
	        double average = sum / myArray.length;
	        System.out.println("Average value of the array integers is : " + average); 
	   }
	
	}    

