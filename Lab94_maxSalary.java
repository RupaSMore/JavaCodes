package Ex_26042025;

public class Lab94_maxSalary {
    public static void main(String[] args) {
        int []sal= {7,10,13,25,30,9,12};
        int max=1;
        for (int i = 0; i <sal.length ; i++) {
            if (sal[i] > max)
            {
                max=sal[i];
            }
        }
        System.out.println(max);
    }
}
