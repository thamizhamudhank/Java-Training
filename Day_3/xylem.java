package New_3;
import java.util.Scanner;
public class xylem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int var=sc.nextInt();
        int outersum=0;
        int innersum=0;

        int sum=var%10;
        int a=var/10;
        while(a>9){
            int digit=a%10;
            innersum=innersum+digit;

        }
    }
}
