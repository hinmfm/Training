
import java.util.Scanner;

public class lab02bai03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số điện: ");
        int x = sc.nextInt();

        if (x <= 100) {
            System.out.println("Số tiền phải trả: " + (x * 1000));
        } else {
            System.out.println("Số tiền phải trả: " + (1000 * 100 + (x - 100) * 1500));
        }
        sc.close();
    }
}
