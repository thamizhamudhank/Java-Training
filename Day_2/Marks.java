package New_2;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int marks;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the marks");
        marks=sc.nextInt();
        if(marks>=90) {
            System.out.println("Excellent");
        }
            else if(marks>=60) {
                System.out.println("Average");
            }
            else if (marks>=60 && marks<=90){
            System.out.println();

            }

        }

    }

