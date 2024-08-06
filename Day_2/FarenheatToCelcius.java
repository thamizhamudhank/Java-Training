package New_2;
import java.util.Scanner;
public class FarenheatToCelcius {
    public static void main(String[] args) {
        double farenheat ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the farenheat");
        farenheat = sc.nextDouble();
        double celcius = ((farenheat - 32)*5/9);
        System.out.println("Celcius: " + celcius);
        if(celcius>37){
            System.out.println("it is Holiday");
        }

    }

}
