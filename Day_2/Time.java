package New_2;
import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time");
        float time = sc.nextFloat();
        if(time>=5.00 && time<=12.00) {
            System.out.println("Good Mrng");
        }
        else if(time>=12.00&& time<=17.00) {
            System.out.println("Good afternoon");
        }
        else if(time>=17.00&& time<=21.00) {
            System.out.println("Good evening");
        }
            else {
                System.out.println("Good night");
            }
        }
    }

