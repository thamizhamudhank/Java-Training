package New_6;

import java.util.Scanner;

public class NonStatic {
    public static void main(String[] args) {
        //calling a non static method
        Scanner sc =new Scanner(System.in);
        sc.nextInt();
        //calling a static method
        NonStatic obj=new NonStatic();//creating an object to call non static method from another class
        obj.test();
        sc.close();
    }
    public void test(){
        System.out.println("qwerty");
    }
}
