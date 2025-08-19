import java.util.Scanner;

public class ArithmeticOp {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();

		System.out.print("Enter second number: ");
		int num2 = input.nextInt();

		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1 * num2;

		if(num2 != 0){
			int quotient = num1/num2;
			int reminder = num1 % num2;
		
			System.out.println("Sum = " + sum);
			System.out.println("Difference = " + difference);
			System.out.println("Product = " + product);
			System.out.println("Quotient = " + quotient);
			System.out.println("Reminder = " + reminder);
		}else{
			System.out.println("Sum: " + sum);
           		System.out.println("Difference: " + difference);
            		System.out.println("Product: " + product);
            		System.out.println("Cannot divide by zero. Quotient and remainder are undefined.");
        	}
	input.close();
	}
}