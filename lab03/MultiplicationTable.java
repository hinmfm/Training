
import java.util.Scanner;

public class lab03bai02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int i =1;

        while (i<=10) { 
            System.out.printf(" %d x %d = %d\n", x, i, x*i);
            i++;
        }

        sc.close();
    }
}
