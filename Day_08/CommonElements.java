package New_8;

public class CommonElements {
    public static void main(String[] args) {
        int arr1[] = new int[]{10,20,30,40,50};
        int arr2[] = new int[]{30,40,50,60,70};
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println("common elements "+arr1[i]);
                }
            }
        }
    }

}
