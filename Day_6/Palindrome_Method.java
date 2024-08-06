package New_6;

import java.util.Scanner;

public class Palindrome_Method {
    public static void main(String[] args) {
        Palindrome_Method obj = new Palindrome_Method();
        obj.demo();
    }


    public void demo() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;
        int ans = 0;
        while (a > 0) {
            int digit = a % 10;
            ans = ans * 10 + digit;
            a = a / 10;
        }
        System.out.println(ans);
        if (ans == b) {
            System.out.println("The number is Palindrome");
        }
    }
}
