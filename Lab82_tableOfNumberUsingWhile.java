package Ex_22042025;

import java.util.Scanner;

public class Lab82_tableOfNumberUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number whose table you want to print");
        int num= sc.nextInt();
        System.out.println("table of number ->"+ num);

        int i=1;
        while (i<=10) {
            int mul = i * num;
            System.out.println(mul);
            i++;
        }
    }
}
