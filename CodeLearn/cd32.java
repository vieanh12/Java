import java.util.Scanner;
public class cd32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0 ){
            System.out.println("n is an even number");
        } else {
            System.out.println("n is an odd number");
        }
    }
}
