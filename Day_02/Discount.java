package New_2;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount of x" );
        x= sc.nextInt();
        System.out.println("Enter the amount of y");
        y= sc.nextInt();
        System.out.println("Enter the amount of z");
        z= sc.nextInt();
        if(x+y+z>5000) {
            System.out.println("Discount 15%");
            System.out.println("Total" + ((x + y + z) * 5) / 100);
        }
        else {
            System.out.println("No Discount");
            System.out.println("Total" + (x + y + z));

        }
    }
}
