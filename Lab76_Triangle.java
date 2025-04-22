package Ex_22042025;

public class Lab76_Triangle {
    public static void main(String[] args) {
        int a=90;
        int b=30;
        int c=30;
        if (a==b && b==c && c==a)
            System.out.println("It is a equilateral triangle");
        else if (a!=b && b!=c && c!=a)
            System.out.println("It is scalene triangle");
        else if (a==90||b==90||c==90)
            System.out.println("It is a right angle triangle");
        else if (a==b && b!=c || b==c && c!=a || a==c && a!=c)
            System.out.println("It is a Isosceles triangle");
    }
}
