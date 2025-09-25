import java.util.Scanner;

class SumRev {
    int a, m = 0, sum = 0;
    void sum(int num) {
        do {
            a = num % 10;
            sum = sum + a;
            num = num / 10;
        } while (num > 0);
        System.out.println("Sum of digits = " + sum);
    }
    void reverse(int num) {
        do {
            a = num % 10;
            m = m * 10 + a;
            num = num / 10;
        } while (num > 0);
        System.out.println("Reverse : " + m);
    }
}

class ReverseAndSum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        n = sc.nextInt();
        SumRev obj = new SumRev();
        obj.sum(n);
        obj.reverse(n);
        sc.close();
    }
}
