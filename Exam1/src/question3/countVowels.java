package question3;

import java.util.Scanner;

public class countVowels {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String str = input.nextLine();

		System.out.println("Number of vowels in word: " + vowels(str) + "\n");
	}

	@SuppressWarnings("unused")
	public static int vowels(String str) 
	{
		int count = 0;
		for (int i = 0; i < str.length(); i++) 
		{
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') 
			{
				count++;
			}
			return count;
		}
		
		return count;
	}
}