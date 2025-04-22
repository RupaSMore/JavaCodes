package Ex_20042025;

import java.util.Scanner;

public class Lab54_NoPositiveNegativeZeromatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();

        if (num>0)
        {
            System.out.println("positive");
        } else if (num<0) {
            System.out.println("negative");
        }
        else {
            System.out.println("zero");
        }
    }
}
