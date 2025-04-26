package Ex_26042025;

import java.util.Scanner;

public class Lab92_arrayEx4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]= new int[4];
        System.out.println("enter num1");
        a[0] =sc.nextInt();
        System.out.println("enter num2");
        a[1]=sc.nextInt();
        System.out.println("enter num3");
        a[2]=sc.nextInt();
        System.out.println("enter num4");
        a[3]=sc.nextInt();

        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);

        }
        float avg= a[0]+a[1]+a[2]+a[3]/4;
        System.out.println("avg->" +avg);

    }
}
