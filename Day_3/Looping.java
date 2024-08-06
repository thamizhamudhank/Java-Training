package New_3;

import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();
        while(a<=b){
            System.out.println(a);
            if(a%2==0){
                System.out.println("it is even");
            }
            else{
                System.out.println("it is odd");
            }
            a++;
        }
    }
}
