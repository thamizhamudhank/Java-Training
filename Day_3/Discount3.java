package New_3;

import java.util.Scanner;

public class Discount3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int age = sc.nextInt();
        if(time>0&& time<=12){
            if(age>0&&age<=13)
                System.out.println("10%discount");
            else if(age>=65) {
                System.out.println("20% discount");
            }
                else if(age>13&&age<=65){
                    System.out.println("no Discount");
                }
            }
            else{
                System.out.println("No Discount");
            }
        }


    }

