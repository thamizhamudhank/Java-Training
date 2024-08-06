package New;
import java.util.Scanner;
public class Age {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the address");
        String address = sc.nextLine();
        System.out.println(age);
        System.out.println(name);
        System.out.println(address);
        System.out.println(number);

    }

}
