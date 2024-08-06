package New_4;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int a=2;
       int exp=3;
       int result=1;
       for(int i=1;i<exp;i++){
           result=result*a;

       }
        System.out.println(result);

    }
}
