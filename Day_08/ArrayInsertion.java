package New_8;
import java.util.Scanner;
    public class ArrayInsertion {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = 5;
            int arr[] = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the element to be inserted:");
            int element = sc.nextInt();
            System.out.println("Enter the position:");
            int pos = sc.nextInt();
            for (int i = n - 1; i >= pos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[pos - 1] = element;
            System.out.println("Array after insertion:");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
            sc.close();
        }

    }

