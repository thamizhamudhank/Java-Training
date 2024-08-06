package New_2;

import javax.swing.*;
import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of a");
        a = sc.nextInt();
        System.out.println("Enter the num of b");
        b = sc.nextInt();
        System.out.println("Enter the num of c");
        c = sc.nextInt();
        if(a%2==0 && b%2==0 && c%2==0){
            System.out.println(a*b*c);
        }
        else if(b%2==0 && c%2==0) {
            System.out.println(b + c);
        }
        else if(a%2==0 && c%2==0) {
            System.out.println(a + c);
        }
        else if(a%2==0 && b%2==0) {
            System.out.println(a + b);
            }

        else if(a%2==0) {
        System.out.println(a);
    }

        else if(b%2==0) {
            System.out.println(b);
        }
        else if(c%2==0){
            System.out.println(c);
        }
        else{
            System.out.println("0");
        }
    }
}
