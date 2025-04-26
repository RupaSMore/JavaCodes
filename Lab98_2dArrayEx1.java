package Ex_26042025;

public class Lab98_2dArrayEx1 {
    public static void main(String[] args) {
        int array_2d[][]= {
                {12, 23, 34},
                {23, 34, 56},
                {45, 43, 32}
        };
        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.print(array_2d[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
            
        }
    }
