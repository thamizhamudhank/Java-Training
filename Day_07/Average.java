package New_7;

public class Average {
    public static void main(String[] args) {
        int arr[]=new int[] {1,2,3,4,5};
        int ans=0;
        int sum=0;
        for (int i=0;i<arr.length;i++) {
            ans = ans+ arr[i] ;
        }
           sum=ans/arr.length;
            System.out.println(sum);
        }

    }

