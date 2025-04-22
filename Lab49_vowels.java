package Ex_20042025;

import java.util.Scanner;

public class Lab49_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your vowel");
        int user_input = sc.next().charAt(0);

        switch (user_input)
        {
            case 'a':
                System.out.println(" it is a vowel");
                break;
            case 'e':
                System.out.println(" it is a vowel");
                break;
            case 'i':
                System.out.println("it is a vowel");
                break;
            case 'o':
                System.out.println("it is a vowel");
                break;
            case 'u':
                System.out.println("it is a vowel");
                break;
            default:
                System.out.println("it is not a vowel");

        }
    }
}
