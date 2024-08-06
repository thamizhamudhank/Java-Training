package New_3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {


    String name ;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  name");
    name = sc.nextLine();
        switch(name){
        case "thamizh":
            System.out.println("first Name");
            break;
        case "amudhan":
            System.out.println("Last Name");
            break;
        case "ak":
            System.out.println("Initial");
            break;

    }
}
}