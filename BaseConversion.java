import java.util.Scanner;

public class BaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);

        String octal = Integer.toOctalString(num);

        String hex = Integer.toHexString(num);

        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex.toUpperCase());

        sc.close();
    }
}
