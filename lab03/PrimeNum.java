
import java.util.Scanner;

public class lab03bai01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
		
        switch (count) {
            case 2:
                System.out.println("Is Prime Number");
                break;
            default:
                System.out.println("Not Prime Number");
                break;
        }

        sc.close();
    }
}
