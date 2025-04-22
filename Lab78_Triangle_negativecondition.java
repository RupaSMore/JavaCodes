package Ex_22042025;

public class Lab78_Triangle_negativecondition {
    public static void main(String[] args) {
        int a = 0;
        int b = 30;
        int c = 30;

        // if a=0 or b=0 or c= 0 --not traingle
        // if -ve value enter --also not triablge
        // so angle must be greater than 0 so that it will be positive
        // and not equal to 0
        if(a+b+c==180 && a>0 && b>0 && c>0) {
            if (a == b && b == c && c == a)
                System.out.println("It is a equilateral triangle");
            if (a != b && b != c && c != a)
                System.out.println("It is scalene triangle");
            if (a == 90 || b == 90 || c == 90)
                System.out.println("It is a right angle triangle");
            if (a == b && b != c || b == c && c != a || a == c && a != c)
                System.out.println("It is a Isosceles triangle");
        }
        System.out.println("It is not a triangle");
    }
}