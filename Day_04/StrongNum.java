package New_4;

import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tem = num;
        int sum = 0;
        while (num != 0) {
            int fact = 1;
            int digit = num % 10;
            for (int i = digit; i > 1; i--) {
                fact = fact * i;
            }
            sum = sum + fact;
            num= num / 10;
        }
        if (sum==tem){
            System.out.println("it is strong num");
        }
        else{
            System.out.println("it is not stromg num");
        }
    }
}