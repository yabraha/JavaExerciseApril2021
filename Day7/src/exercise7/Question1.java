package exercise7;

import java.util.Set;
import java.util.TreeSet;

//Given the list below, please find the sorted unique values, using the set interface
//(‘A’,’F’,’A’,’D’, ‘F’,’C’, ‘B’)

public class Question1 {

	public static void main(String[] args) {
		
		Set<String> myList = new TreeSet<String>();
		
		myList.add("A");
		myList.add("F");
		myList.add("A");
		myList.add("D");
		myList.add("F");
		myList.add("C");
		myList.add("B");
		
		System.out.println(myList);
		
		
	}

}
