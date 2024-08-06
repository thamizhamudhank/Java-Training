package New_2;
import java.util.Scanner;
public class SwitchFruits {
    public static void main(String[] args) {
        String fruit ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fruit name");
        fruit = sc.nextLine();
        switch(fruit){
            case "apple":
                System.out.println("An apple a day keeps the doctor away");
                break;
            case "bannana":
                System.out.println("bananas are good source of pottassium");
                break;
            case "orange":
                System.out.println("Orange is a good source of vitamin C");
                break;
            default:
                System.out.println("nothing");

        }
    }
}
