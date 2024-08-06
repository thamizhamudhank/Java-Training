package New_10;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String c =sc.nextLine();
        System.out.println(s==c);
        System.out.println(s.equals(c));//Compare the content of two Strings...

        System.out.println(s.equalsIgnoreCase(c));//to ignore the Case int the string..

    }
}