package Ex_22042025;

public class Lab83_Fibbonacciseries {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21
        int a=0;
        int b=1;
        int n=10;
        int c=0;
        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i <=n; i++) {
            c=a+b;
            System.out.println(c);
          a=b;
          b=c;
        }
    }
}
