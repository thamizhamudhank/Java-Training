package New_10;

import java.util.Scanner;

public class FindVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name");
        String name=sc.nextLine();
        String name1=name.toLowerCase();
        char [] ch=name1.toCharArray();
        for(int i=0;i<ch.length;i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {

                System.out.print(name.charAt(i));

            }

        }
    }
}
