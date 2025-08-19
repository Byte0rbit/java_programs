import java.util.Scanner;
public class Amstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start: ");
		int start = sc.nextInt();
		System.out.print("Enter end: ");
		int end = sc.nextInt();
		System.out.println("Amstrong numbers between " + start + "and " + end +" :");
		for(int num = start; num<=end; num++){
			int original = num;
			int sum = 0;
			
			int temp = num;
			int digitCount =0;
			while(temp>0){
			digitCount++;
			temp/=10;
			}
			temp = num;
			while (temp>0){
				int digit = temp % 10;
				sum += Math.pow(digit, digitCount);
				temp /= 10;
			}
		if(sum == original) {
			System.out.println(original);
		}
	}
	sc.close();
	}
}
		