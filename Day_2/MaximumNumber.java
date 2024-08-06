package New_2;
import java.util.Scanner;
public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int number1=sc.nextInt();
        System.out.println("Enter the number 2");
        int number2=sc.nextInt();
        if(number1>number2) {
            System.out.println("Number 1 is greater");
        }
        if (number1==number2) {
                System.out.println("Both are equal");
            }else
        {
                System.out.println("Number 2 is greater");
            }
    }
}
