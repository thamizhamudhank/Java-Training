package New_3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Language {
    public static void main(String[] args) {
        String a ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code");
        a= sc.nextLine();
        switch (a)
        {
            case"er":
                System.out.println("Hello");
                break;
            case "es":
                System.out.println("Hola");
                break;
            case "fr":
                System.out.println("Benjour");
                break;
            default:
                System.out.println("Unsupportable language");
                break;


        }

    }
}
