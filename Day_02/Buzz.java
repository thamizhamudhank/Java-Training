package New_2;
import java.util.Scanner;
public class Buzz {
    public static void main(String[] args) {
        int a;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        a= sc.nextInt();
        if(a%7==0 || a%10==7){
            System.out.println("Buzz" );
        } else {
            System.out.println("Buzz");
        }
    }
}
