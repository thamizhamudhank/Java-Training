package New_1;
import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        age=sc.nextInt();
        if(age%2==0){
            System.out.println("Age is Even");
        }

    }
}
