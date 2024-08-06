package New_7;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean arr[] = new boolean[4];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextBoolean();
    }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}