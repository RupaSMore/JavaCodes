package Ex_19042025;

public class Lab25_PrePost_Ex4 {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a + a++);
        //Exp= 11, a=11
        //b-> a++ -> Exp=11, a=12
        System.out.println(a);
    }
}
