package Ex_20042025;

import java.util.Scanner;

public class Lab41_IfLoopEx5_EvenOdd_usingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int user_input = sc.nextInt();
if(user_input%2==0)
{
    System.out.println("number is even");
}
else {
    System.out.println("number is odd");
}
    }
}
