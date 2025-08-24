import java.util.Scanner;

public class ReverseAndSum {
    int number;
    int sum;
    int reverse;

    public ReverseAndSum(int num) {
        number = num;
        sum = 0;
        reverse = 0;
    }

    public void calculate() {
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
    }

    
    public int getSum() {
        return sum;
    }

    public int getReverse() {
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = sc.nextInt();

        ReverseAndSum obj = new ReverseAndSum(input);
        obj.calculate();

        System.out.println("Sum of digits: " + obj.getSum());
        System.out.println("Reverse: " + obj.getReverse());

        sc.close();
    }
}
