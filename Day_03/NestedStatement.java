package New_3;

import java.util.Scanner;

public class NestedStatement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number ");
         int a=sc.nextInt();

        if(a%2==0) {
            System.out.println("Itis even number");
            if (a % 5 == 0) {
                System.out.println("It is Divisible by 5");
            }
            else{
                System.out.println("not divisible by 5");
            }
        }
            else{
                System.out.println("it is odd number");
            }
        }
    }

