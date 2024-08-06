package New_7;

import java.util.Scanner;

public class TallestPlayer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the height of the student");
        int leng=sc.nextInt();
        int[] team=new int[leng];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the height of the student"+i);
            arr[i]=sc.nextInt();

        }
    }
}
