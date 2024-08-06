package New_10;

import java.util.Scanner;

public class EveryEventUpper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char []ch =a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            if(i%2==0 && a.charAt(0)!=' '){
                char h=(char) (ch[i] - 32);
                System.out.print(h);

            }
            else{
                System.out.print(ch[i]);
            }

        }
    }
}
