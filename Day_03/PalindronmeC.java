package New_3;

import java.util.Scanner;

public class PalindronmeC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = a;
        int ans=0;
        while(a>0){
            int digit =a%10;
            ans=ans*10+digit;
            a=a/10;
        }
        System.out.println(ans);
        if (ans == b){
            System.out.println("The number is Palindrome");
        }
    }
}
