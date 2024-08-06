package New_3;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        String Season;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Season");
        String season=sc.nextLine();
        switch(season){
            case"Winter":
                System.out.println("December,january,february");
                break;
            case"Summer":
                System.out.println("March,April,May,June");
                break;
            case"Rainy":
                System.out.println("July,August,September");
                break;
            case"Spring":
                System.out.println("October,November");
                break;
            default:
                System.out.println("Invalid Input ");
        }


    }
}
