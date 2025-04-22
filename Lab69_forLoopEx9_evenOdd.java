package Ex_21042025;

public class Lab69_forLoopEx9_evenOdd {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) { // i = 0 to 9, times  = 10
            //System.out.println(i);
            if (i%2 == 0) {
                System.out.println(i + "-> even");
                continue;
            }
            System.out.println(i + "-> Odd!!");
        }
    }
}
