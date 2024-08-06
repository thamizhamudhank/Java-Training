package New_7;

public class IdenticalArray {
    public static void main(String[] args) {
        int arr1[]=new int[]{1,2,3,4,5};
        int arr2[]=new int[]{1,2,3,4,5};
        if (arr1.length == arr2.length) {
            for (int i=0;i<arr1.length;i++) {
                if (arr1[i] != arr2[i]) {
                    System.out.println("not identical");
                }
            }
            System.out.println("identical");
        }
    }
}

