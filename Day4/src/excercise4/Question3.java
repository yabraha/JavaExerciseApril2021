//Write a Java program to find the index of an array element.
package excercise4;

public class Question3 {

		// Write a Java program to find the index of an array element.
		
	
	 public static int  findIndex (int[] myArray, int t) {
	        if (myArray == null) return -1;
	        int len = myArray.length;
	        int i = 0;
	        while (i < len) {
	            if (myArray[i] == t) return i;
	            else i=i+1;
	        }
	        return -1;
	    }
	    public static void main(String[] args) {
	      int[] myArray = {30, 19, 46, 5, 19, 26, 7, 18, 44, 66};
	      System.out.println("Index position of 5 is: " + findIndex(myArray, 5));
	      System.out.println("Index position of 44 is: " + findIndex(myArray, 44));
	      System.out.println("Index position of 18 is: " + findIndex(myArray, 18));
	      System.out.println("Index position of 30 is: " + findIndex(myArray, 30));
	      System.out.println("Index position of 7 is: " + findIndex(myArray, 7));
	       }

	}

