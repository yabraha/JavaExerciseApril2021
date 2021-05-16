package question1;

public class Variables {

	public static void main(String[] args) {
		String greeting = "Hellow my name is ";
		String firstName = "Yafet Abraha";
		String city_state = "Charlotte NC";
		double gross_salary = 95000.56;

		System.out.println(greeting + firstName + ", " + "I live in " + city_state + "," + "my gross salary is " + "$"
				+ gross_salary + ".");

		double taxRate = 0.20;
		double tax = gross_salary * taxRate;
		double netSalary = gross_salary - tax;

		System.out.println("I pay " + "$" + tax + " in tax and I take home " + "$" + netSalary + ".");

	}

}
