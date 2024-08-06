package New_2;

import java.util.Scanner;

public class ElseifCond {
    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        num1 = sc.nextInt();
        if (num1 % 3 == 0) {
            System.out.println("sanjai loves sangeetha");
        } else if (num1 % 5 == 0) {
            System.out.println("sangeetha loves sanjai");
        } else {
            System.out.println("Breakup");
        }
    }
}
