package Ex_26042025;

import java.util.Arrays;

public class Lab96_2ndmaxSalary {
    public static void main(String[] args) {
        int[] sal = {7, 10, 13, 25, 30, 9, 12};

        Arrays.sort(sal);
        System.out.println("2nd max salary:" +sal[sal.length-2]);
    }
}
