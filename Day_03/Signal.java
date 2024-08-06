package New_3;

import java.util.Scanner;

public class Signal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if(a.equals("Red")){
            System.out.println("Stop");
        }
        else if(a.equals("Yellow")){
            System.out.println("Get REady");
        }
        else if(a.equals("Green")){
            System.out.println("Go");
        }
        else{
            System.out.println("invalid colour");
        }
    }
}
