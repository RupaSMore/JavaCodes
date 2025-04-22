package Ex_21042025;

import java.util.Scanner;

public class Lab72_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int fact=1;
        for (int i = 1; i <= n; i++) {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
