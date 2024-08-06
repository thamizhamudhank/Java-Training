package New_2;
import java.util.Scanner;
public class SalaryBonus {
    public static void main(String[] args) {
        int salary;
        int experience;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        salary = sc.nextInt();
        System.out.println("Experience");
        experience = sc.nextInt();
        if(experience>5) {
            System.out.println("Total salary:"+(salary+(salary*5)/100));

        }
        else{
            System.out.println("Total salary:"+salary);
        }

    }
}
