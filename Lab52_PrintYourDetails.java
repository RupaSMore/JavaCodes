package Ex_20042025;

import java.util.Scanner;

public class Lab52_PrintYourDetails {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();

        System.out.println("enter your age");
        int age= sc.nextInt();

        System.out.println("enter your salary");
        double salary = sc.nextDouble();

        System.out.println("My name is-> " + name);
        System.out.println("my age is->" + age);
        System.out.println("my salary is-> " + salary);
    }
}
