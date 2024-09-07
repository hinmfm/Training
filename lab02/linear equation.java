
import java.util.Scanner;

public class lab02bai01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("phương trình có vô số nghiệm");
        } else if (a == 0 && b != 0) {
            System.out.println("phương trình vô nghiệm");
        } else {
            float x = (float) -b / a;
            System.out.printf("x = %.3f", x);
        }

        sc.close();
    }
}
