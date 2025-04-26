package Ex_26042025;

public class Lab99_ArrayEvenOdd {
    public static void main(String[] args) {
        int a[]={12,23,34,45,56,67,54,43,32,33,44,46};
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0)
            {
                System.out.println(a[i] + "-> is even");
            }
            else {
                System.out.println(a[i] + "-> is odd");
            }
        }
    }
}
