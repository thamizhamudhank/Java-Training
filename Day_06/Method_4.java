package New_6;

import java.util.Scanner;

public class Method_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        multiply(a,b);
    }
    public static void multiply(int a,int b) {
        int result = a * b;
        System.out.println(result);
    }
}