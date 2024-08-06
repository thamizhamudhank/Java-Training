package New_2;

import java.util.Scanner;

public class Triangle1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side a" );
        a=sc.nextInt();
        System.out.println("Enter the side b");
        b=sc.nextInt();
        System.out.println("enter the side c");
        c=sc.nextInt();
        if((a*a)+(b*b)==c){
            System.out.println("it is pythagorean theorem");
        }
    }
}
