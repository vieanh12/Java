import java.util.Scanner;
public class cs37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a);
        } else System.out.println(Math.max(b, c));

    }
}
