package New_7;

public class Odd_Even {
    public static void main(String[] args) {
        int arr[]=new int[] {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("Even numbers are "+arr[i]);
            }
        }
    }
}


