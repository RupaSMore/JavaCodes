package Ex_20042025;

import java.util.Scanner;

public class Lab43_Ifelse_Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1 = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number2");
        int num2= sc1.nextInt();

        if(num1>num2)
        {
            System.out.println(num1 + " is the max number");
        } else if (num2>num1) {
            System.out.println(num2 + " is the max number");
        }
        else {
            System.out.println("both are equal numbers");
        }
    }
}
