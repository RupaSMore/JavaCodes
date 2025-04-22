package Ex_20042025;

import java.util.Scanner;

public class Lab44_Ifelse_Ex2_GradeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int score = sc.nextInt();
        if(score>=90)
        {
            System.out.println(score + " grade is A");
        } else if (score>=80) {
            System.out.println(score + " grade is B");
        } else if (score>=70) {
            System.out.println(score + " grade is C ");
        } else if (score>=60) {
            System.out.println(score + " grade is D ");
        }
        else {
            System.out.println(score + " fail");
        }

    }
}
