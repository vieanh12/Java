import java.util.Scanner;
public class cd41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x > 0 && y > 0 ) {
            System.out.println("This point lies in the 1st quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("This point lies in the 2rd quad");
        } else if (x < 0 && y < 0) {
            System.out.println("This point lies in the 3rd quad");
        } else {
            System.out.println("This point lies in the 4th quad");
        }
    }
}
