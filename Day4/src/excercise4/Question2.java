//Write a Java program to test if an array contains aspecificvalue. 
package excercise4;

public class Question2 {

	public static void main(String[] args) {
//Write a Java program to test if an array contains a specific value.
	    int[] num = {1, 2, 3, 4, 5};
	    int toFind = 4;
	    boolean found = false;

	    for (int n : num) {
	      if (n == toFind) {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      System.out.println(toFind + " is found.");
	    else
	      System.out.println(toFind + " is not found.");
	  }
	}


	


