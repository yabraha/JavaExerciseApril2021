package question2;

import java.util.Scanner;

public class rowPyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		{
			System.out.println("Enter the value for rows: ");
			int rows = input.nextInt();

			for (int i = 1; i <= rows; ++i) {
				for (int n = 1; n <= i; ++n) {
					System.out.print("* ");
				}
				System.out.println();
			}

		}
	}
}
