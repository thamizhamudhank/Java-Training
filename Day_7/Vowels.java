package New_7;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        char[] arr = new char[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }

//            arr[i]='a';
//            arr[1]='e';
//            arr[2]='i';
//            arr[3]='o';
//            arr[4]='u';
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }
}