package Ex_26042025;

import java.util.Scanner;

public class Lab93_scannerForloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] marks = new float[5];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks of the sub " + (i + 1));
            marks[i] = sc.nextFloat();
        }
        for (int j = 0; j < marks.length; j++) {
            System.out.println(marks[j]);
        }
    }
}
