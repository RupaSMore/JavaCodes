package Ex_21042025;

public class Lab68_forLoopEx9 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) { // i = 0 to 9, times  = 10
            System.out.println(i);
            if (i == 5) {
                continue;
            }
            System.out.println("After!!");
        }
    }
}
