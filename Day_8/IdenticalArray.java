package New_8;

import java.util.Scanner;

public class IdenticalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        System.out.println("Enter the elements of the first ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean tham = true;
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                tham = false;
                break;
            }
        }
        if (tham) {
            System.out.println("identical");
        } else {
            System.out.println("not identical");
        }
        sc.close();
    }


}
