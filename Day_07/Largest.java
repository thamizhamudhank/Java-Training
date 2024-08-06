package New_7;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        double[] team=new double[size];
        for(int i=0;i<team.length;i++){
            System.out.println("Enter the player height"+i);
            team [i]=sc.nextDouble();
        }
        double largest=team[0];
        for(int i=0;i<team.length;i++){
            System.out.println(largest);
        }
    }
}

