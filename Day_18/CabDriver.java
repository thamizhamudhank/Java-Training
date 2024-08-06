package New_18;

import java.util.Scanner;

public class CabDriver {
    public static void Checkcab(Cab c){
        if(c instanceof Ola){
            Ola o=(Ola)c;
            System.out.println(o.Model);
            o.drive();
            o.cab();
        }
        else{
            Prime p=(Prime)c;
            System.out.println(p.Model);
            p.drive();
            p.cab();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int  i= sc.nextInt();
       if(i==1){
           Checkcab(new Ola());
       }
       else {
           Checkcab(new Prime());
       }
    }
}
