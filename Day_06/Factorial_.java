package New_6;

import java.util.Scanner;

public class Factorial_ {
    public static void main(String[] args) {
        Factorial_ obj = new Factorial_();
        obj.demo();
    }

    public void demo() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact=1;
        for (int i = 1; i <=num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}