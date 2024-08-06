package New_8;

public class MergingArray {
    public static void main(String[] args) {
        int arr1[] = new int[]{10, 20, 30, 40, 50};
        int arr2[] = new int[]{60, 70, 80, 90, 100};
        int arr3[] = new int[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[k] = arr1[i];
            k++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[k] = arr2[i];
            k++;
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" " );
        }
    }

}
