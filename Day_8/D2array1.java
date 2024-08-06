package New_8;

import java.util.Arrays;

public class D2array1 {
    public static void main(String[] args) {
        int sum=0;
        int a[][]={{1,2,3,}, {1,2,3,}, {1,2,3}};
        System.out.println(Arrays.toString(a[0]));
        for(int row =0;row<a.length;row++){
            for (int col=0;col<a[row].length;col++){
                System.out.print(a[row][col]+" ");
              sum= sum +a[row][col];
                System.out.println(sum);
            }
            System.out.println();
        }


    }
}
