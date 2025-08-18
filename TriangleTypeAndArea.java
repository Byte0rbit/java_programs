import java.util.Scanner;

public class TriangleTypeAndArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("The triangle is Equilateral.");
            } 
            else if (a == b || b == c || a == c) {
                System.out.println("The triangle is Isosceles.");
            } 
            else {
                System.out.println("The triangle is Scalene.");
            }

            double s = (a + b + c) / 2; // semi-perimeter
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Area of the triangle: " + area);
        } 
        else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        sc.close();
    }
}
