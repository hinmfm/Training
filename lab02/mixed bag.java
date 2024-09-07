
import java.util.Scanner;

public class lab02bai04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai |");
        System.out.println("| 3. Tính số tiền điện |");
        System.out.println("| 4. Kết thúc |");
        System.out.println("++ ------------------ ++");

        System.out.println("Tính năng lựa chọn: ");
        int n = sc.nextInt();

        switch (n) {
            case 1 -> {
                System.out.println("| 1. Giải phương trình bậc nhất |");

                System.out.println("Nhập biến a: ");
                int a = sc.nextInt();
                System.out.println("Nhập biến b: ");
                int b = sc.nextInt();

                System.out.printf("Phương trình của bạn là: %d * x + %d = 0", a, b);

                if (a == 0 && b == 0) {
                    System.out.println("phương trình có vô số nghiệm");
                } else if (a == 0 && b != 0) {
                    System.out.println("phương trình vô nghiệm");
                } else {
                    float x = (float) -b / a;
                    System.out.printf("x = %.3f", x);
                }
            }

            case 2 -> {
                System.out.println("| 2. Giải phương trình bậc hai |");
                System.out.println("Nhập biến a: ");
                int a1 = sc.nextInt();
                System.out.println("Nhập biến b: ");
                int b1 = sc.nextInt();
                System.out.println("Nhập biến c: ");
                int c1 = sc.nextInt();

                System.out.printf("Phương trình của bạn là: %d*x^2 + %d*x + %d = 0\n", a1, b1, c1);

                if (a1 == 0 && b1 == 0) {
                    if (c1 != 0) {
                        System.out.println("Phương trình vô nghiệm");
                    } else {
                        System.out.println("Phương trình có vô số nghiệm");
                    }
                } else if (a1 == 0 && b1 != 0) {
                    if (c1 == 0) {
                        System.out.println("x = 0");
                    } else {
                        float x = (float) -c1 / b1;
                        System.out.printf("x = %.3f", x);
                    }
                } else if (a1 != 0) {
                    int delta = b1 * b1 - 4 * a1 * c1;
                    if (delta < 0) {
                        System.out.println("Phương trình vô nghiệm");
                    } else if (delta > 0) {
                        double x1 = (-b1 + Math.sqrt(delta)) / (2 * a1);
                        double x2 = (-b1 - Math.sqrt(delta)) / (2 * a1);
                        System.out.println("Phương trình có 2 nghiệm riêng biệt");
                        System.out.printf("x1 = %.3f\n", x1);
                        System.out.printf("x2 = %.3f\n", x2);
                    } else {
                        double x = (-b1) / (2 * a1);
                        System.out.printf("nghiệm kép = %.3f", x);
                    }
                }
            }

            case 3 -> {
                System.out.println("| 3. Tính số tiền điện |");
                System.out.println("Nhập số điện: ");
                int x = sc.nextInt();

                if (x <= 100) {
                    System.out.println("Số tiền phải trả: " + (x * 1000));
                } else {
                    System.out.println("Số tiền phải trả: " + (1000 * 100 + (x - 100) * 1500));
                }
            }

            default -> System.out.println("| 4. Kết thúc |");
        }
        sc.close();
    }
}
