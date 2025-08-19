import java.util.Scanner;

public class ReverseAndSum {
    public static void main(String[] args) {
        System.out.println("Enter the number:  ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, reverse = 0;

        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("Reverse: " + reverse);
    }
}
