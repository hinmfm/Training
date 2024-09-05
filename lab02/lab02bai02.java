
import java.util.Scanner;

public class lab02bai02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập biến a: ");
        int a = sc.nextInt();
        System.out.println("Nhập biến b: ");
        int b = sc.nextInt();
        System.out.println("Nhập biến c: ");
        int c = sc.nextInt();

        System.out.printf("Phương trình của bạn là: %d*x^2 + %d*x + %d = 0\n", a, b, c);

        if (a == 0 && b == 0) {
            if (c != 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình có vô số nghiệm");
            }
        } else if (a == 0 && b != 0) {
            if (c == 0) {
                System.out.println("x = 0");
            } else {
                float x = (float) -c / b;
                System.out.printf("x = %.3f", x);
            }
        } else if (a != 0) {
            int delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm riêng biệt");
                System.out.printf("x1 = %.3f\n", x1);
                System.out.printf("x2 = %.3f\n", x2);
            } else {
                double x = (-b) / (2 * a);
                System.out.printf("nghiệm kép = %.3f", x);
            }
        }
        sc.close();
    }
}
