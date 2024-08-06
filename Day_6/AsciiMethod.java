package New_6;

import java.util.Scanner;

public class AsciiMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.println(demo(ch));
    }
    public static int demo(char ch){
        return ch;
    }
}
