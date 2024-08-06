package New_3;
import java.util.Scanner;
public class PrintNum   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch =sc.next().charAt(0);
        char b = ch;

        if(ch>=65&&ch<=90) {


            do {
                System.out.println(+ch);
                System.out.println(+b);
                ch++;
                b++;
            } while (ch > 90);
        }
            else
            {
                System.out.println("invalid");

            }
        }
    }

