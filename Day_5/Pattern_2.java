package New_5;

public class Pattern_2 {
    public static void main(String[] args) {
     int n=3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j==n+1||i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
