package New_2;
import java.util.Scanner;
public class UppercaseOrLowercase {
    public static void main(String[] args) {
        char a;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Letter");
        a=sc.next().charAt(0);
        if(a>=65 && a<=90) {
            System.out.println("it is Uppercase");
        }
        else if(a>=97 && a<=122) {
            System.out.println("it is Lowercase");
        }
            else{
                System.out.println("it is not a letter");
            }
        }
    }
