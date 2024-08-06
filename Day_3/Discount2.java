package New_3;

import java.util.Scanner;

public class Discount2 {
    public static void main(String[] args) {
        double amount;
        double discount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        amount = sc.nextDouble();
        if(amount>500) {
            discount = amount / 100 * 10;
            System.out.println("Total amount");
            System.out.println(amount - discount);
        }
        else if(amount>250){
            discount = amount / 100 * 5;
            System.out.println("Total amount");
            System.out.println(amount - discount);
        }
        else{
            System.out.println("No Discount");
        }
    }
}
