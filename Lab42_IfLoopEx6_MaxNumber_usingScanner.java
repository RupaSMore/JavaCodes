package Ex_20042025;

import java.util.Scanner;

public class Lab42_IfLoopEx6_MaxNumber_usingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int user_input1 = sc.nextInt();

        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter the number2");
        int user_input2= sc.nextInt();
      //  System.out.println(Math.max(user_input2,user_input1));

        if(user_input1>user_input2)
        {
            System.out.println(user_input1 + "is the max number" );
        }
        System.out.println(user_input2 + " is the max number");
    }

}
