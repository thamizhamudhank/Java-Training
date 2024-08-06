package New_1;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Angle of a");
        a = sc.nextInt();
        System.out.println("Enter the Angle of b");
        b = sc.nextInt();
        System.out.println("Enter the Angle of c");
        c = sc.nextInt();
        if(a+b+c==180){
            System.out.println("it is a triangle");
        }

    }


}
