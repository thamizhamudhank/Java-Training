package New_4;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
    if(i*i==num){
            System.out.println("Square root is " +i);
        }
    }
}
