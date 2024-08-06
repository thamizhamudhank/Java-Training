package New_1;
import java.util.Scanner;
public class DecisionStatements {
    public static void main(String[] args) {
        int age ;
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the age");
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("eligible ");
        } else
        {
            System.out.println("not eligible");
        }
    }
}
