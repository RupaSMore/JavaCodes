package Ex_20042025;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Lab51_Vowels_switchWithLessCode {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter data");
        char user_input = sc.next().charAt(0);

        switch (user_input){
            case 'a','e','i','o','u':
                System.out.println("it is vowel");
            default:
                System.out.println("it is not vowel, it is consonant" );
        }
    }
}
