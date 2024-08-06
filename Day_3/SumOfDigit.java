package New_3;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 0;
        int j = 1;
        int k = 1;
        while (i <= num) {
            j = i + j;
            k = i * j;
            num=num/10;
            i++;
        }
        System.out.println(j);
        System.out.println(k);

        if(j==k){
            System.out.println("it is spy number");
        }
        else{
            System.out.println("not a spy number");
        }
    }
}
