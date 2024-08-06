package New_7;

import java.util.Scanner;

public class InsertingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be inserted");
        int element = sc.nextInt();
        System.out.println("Enter the position");
        int pos = sc.nextInt();
        for (int i = n - 1; i >= pos - 1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos - 1] = element;
        System.out.println("Array after insertion");
        for (int i = 0; i < n + 1; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }



}