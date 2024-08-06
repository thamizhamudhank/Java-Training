package New_8;

public class ZigZag {
    public static void main(String[] args) {
        int arr1[] = new int[]{10, 20, 30, 40, 50};
        int arr2[] = new int[]{30, 40, 50, 60, 70};
        int arr3[] = new int[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[k] = arr1[i];
            k++;
            arr3[k] = arr2[i];
            k++;
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" " );
        }


    }
}
