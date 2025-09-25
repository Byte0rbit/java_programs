import java.util.Scanner;

public class BaseConversion {

    static String toBinary(int num) {
        String binary = "";
        int n = num;
        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary;  // prepend remainder
            n = n / 2;
        }
        return (binary.length() > 0) ? binary : "0";
    }

    static String toOctal(int num) {
        String octal = "";
        int n = num;
        while (n > 0) {
            int rem = n % 8;
            octal = rem + octal;  // prepend remainder
            n = n / 8;
        }
        return (octal.length() > 0) ? octal : "0";
    }

    static String toHexadecimal(int num) {
        String hex = "";
        int n = num;
        char[] hexDigits = {'0','1','2','3','4','5','6','7',
                            '8','9','A','B','C','D','E','F'};
        while (n > 0) {
            int rem = n % 16;
            hex = hexDigits[rem] + hex;  // prepend remainder
            n = n / 16;
        }
        return (hex.length() > 0) ? hex : "0";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        System.out.println("Binary: " + toBinary(number));
        System.out.println("Octal: " + toOctal(number));
        System.out.println("Hexadecimal: " + toHexadecimal(number));

        sc.close();
    }
}
