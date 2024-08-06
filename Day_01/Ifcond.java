package New_1;
import java.util.Scanner;
public class Ifcond {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        int c = a*b;
        if(c%3==0 && c%5==0){
            System.out.println("it is divisible by 5,3");
        }
    }
}
