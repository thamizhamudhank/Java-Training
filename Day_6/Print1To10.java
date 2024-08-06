package New_6;

import java.util.Scanner;

public class Print1To10 {
    public static void main(String[] args) {
        Print1To10 obj=new Print1To10();
       // obj.demo();
        System.out.println(obj.demo());
    }
    public int demo(){
        int ans=0;
        for(int i=1;i<=10;i++){
            ans=ans+i;
        }
        return ans;
    }
}
