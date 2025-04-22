package Ex_22042025;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Lab81_tableOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number whose table you want to print");
        int num= sc.nextInt();
        System.out.println("table of number ->"+ num);
        for (int i=1;i<=10;i++)
        {
            int mul=i*num;

            System.out.println(mul);
        }
    }
}
