package New_4;

import java.util.Scanner;

public class SunnyNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=0;
        num=num+1;
        for(int i= 1;i<num;i++){
            if(num%i == 0){
                res=res+i;
            }
        }
        System.out.println(res);
        if(res==num){
            System.out.println("it is Sunny numnber");
    }
        else{
            System.out.println("not a sunny number");
        }
}



}
