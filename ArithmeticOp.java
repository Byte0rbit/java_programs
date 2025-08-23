public class ArithmeticOp {
    public static void main(String args[]) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);

        if (num2 != 0) {
            int quotient = num1 / num2;
            int remainder = num1 % num2;
            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder = " + remainder);
        } else {
            System.out.println("Cannot divide by zero. Quotient and remainder are undefined.");
        }
    }
}
