package New_7;

import java.util.Scanner;

public class TargetValue {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        int target = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("target value is" + arr[i]);
            }

        }
    }
}