package New_4;

public class Divide {
    public static void main(String[] args) {
        int a=1;
        int b=60;
        for(int i=1;i<=b;i++){
            if(i%3==0 && i%5==0){
                int result=i;
                result =result+i;
                System.out.println(result);
            }

        }
    }
}

