package excercise4;

import java.util.Arrays;

public class Question4 {

	public static void main(String[] args) {
		// Write a Java program to copy an array by iterating the array. 

		int[] my_array = {45, 4, 34, 23, 12, 45};
		   int[] new_array = new int[6];     
		 
		   System.out.println("Source Array : "+Arrays.toString(my_array));     
		   
		   for(int i=0; i < my_array.length; i++) {
		    new_array[i] = my_array[i];
		}
		   System.out.println("Copy Array: "+Arrays.toString(new_array));
		 }

}
