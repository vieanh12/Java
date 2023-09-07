import java.util.Scanner;
public class cd35 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (a.equals(b)){
            System.out.println("2 people have the same name");
        }else{
            System.out.println("2 people don't have the same name");
        }
    }
}