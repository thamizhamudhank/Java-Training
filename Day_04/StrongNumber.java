package New_4;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int res = 0;
        while (num > 0) {
            int rem = num % 10;
            int f = 1;
            for (int i = 1; i <= rem; i++) {
                f = f * i;
            }
            res = res + f;
            num = num / 10;
        }
        if (res == temp) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
    }
}