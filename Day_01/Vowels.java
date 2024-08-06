package New_1;
import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name");
        String name=sc.nextLine();
        for(int i=0;i<name.length();i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                System.out.println("Vowels are " + name.charAt(i));

            }
        }
    }
}
