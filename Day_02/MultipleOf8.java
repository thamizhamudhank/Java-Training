package New_2;
import java.util.Scanner;
public class MultipleOf8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ener number");
        int number = sc.nextInt();
        if(number%8==0){
            System.out.println("It is multiple of 8");
        }
    }
}
