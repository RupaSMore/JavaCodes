package Ex_19042025;

public class Lab27_PrePost_Ex6 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //A-> Exp=11, a=11
        //B-> Exp=11, a=12
        //C-> Exp=12, a=13
        //o/p= A+B+C=11+11+12=34
    }
}
