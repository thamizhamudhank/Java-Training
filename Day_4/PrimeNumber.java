package New_4;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res  = 0;
        for (int i = 1; i <=num; i++) {
            if ( num%i == 0) {
                res++;
            }
        }
        if (res == 2)
            System.out.println("it is prime");
        else
            System.out.println("not a prime");
    }
}