package New_2;
import java .util.Scanner;

public class Remainder0 {
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner sc = new Scanner(System.in);
        System.out.println("number1");
        number1 = sc.nextInt();
        //System.out.println(number);
        number2 = sc.nextInt();
        if(number1%number2==0) {
            System.out.println("Divisible");
        } else{
                System.out.println("Not Divisible");
            }
        }
    }

