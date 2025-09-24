import java.util.Scanner;

public class BaseConversion {

    static String toBinary(int num) {
        StringBuilder binary = new StringBuilder();
        int n = num;
        while (n > 0) {
            int rem = n % 2;
            binary.insert(0, rem);
            n = n / 2;
        }
        return (binary.length() > 0) ? binary.toString() : "0";
    }

    static String toOctal(int num) {
        StringBuilder octal = new StringBuilder();
        int n = num;
        while (n > 0) {
            int rem = n % 8;
            octal.insert(0, rem);
            n = n / 8;
        }
        return (octal.length() > 0) ? octal.toString() : "0";
    }

    static String toHexadecimal(int num) {
        StringBuilder hex = new StringBuilder();
        int n = num;
        char[] hexDigits = {'0','1','2','3','4','5','6','7',
                            '8','9','A','B','C','D','E','F'};
        while (n > 0) {
            int rem = n % 16;
            hex.insert(0, hexDigits[rem]);
            n = n / 16;
        }
        return (hex.length() > 0) ? hex.toString() : "0";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        System.out.println("Binary: " + toBinary(number));
        System.out.println("Octal: " + toOctal(number));
        System.out.println("Hexadecimal: " + toHexadecimal(number));
    }
}
