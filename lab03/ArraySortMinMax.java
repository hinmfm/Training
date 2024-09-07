
import java.util.Arrays;
import java.util.Scanner;

public class lab03bai03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int temp = a[i];
                if (a[i] < a[j]) {
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        int idx = a.length - 1;

        System.err.println(Arrays.toString(a));
        System.err.printf("Phần tử nhỏ nhất là: %d\n", a[0]);
        System.err.printf("Phần tử lớn nhất là: %d", a[idx]);

        sc.close();
    }
}
