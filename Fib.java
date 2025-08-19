import java.util.Scanner;

public class Fib {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scan.nextInt();
		int a=0, b=1;
		System.out.println("Fibonacci up to " + n + " numbers");
		for(int i=1;i<=n;i++){
			System.out.print(a +" ");
			int c= a+b;
			a=b;
			b=c;
		}
	}
}
		