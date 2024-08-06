package New_2;
import java.util.Scanner;
public class Youngest {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of a");
        a = sc.nextInt();
        System.out.println("Enter the age of b");
        b = sc.nextInt();
        System.out.println("Enter the age of c");
        c = sc.nextInt();
        if (a<b && a<c) {
            System.out.println("a is Youngest");
        }   else if (b<c) {
            System.out.println("b is ypungeest");
        }
        else {
            System.out.println("c is youngest");
        }
    }
}
