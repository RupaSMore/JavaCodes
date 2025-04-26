package Ex_26042025;

import java.util.Scanner;

public class Lab101_stringQues {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your string");
        String str= sc.next();
       // System.out.println(user_input);

        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.substring(i)+str.substring(0,i));

        }
    }

}
