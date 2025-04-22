package Ex_19042025;

public class Lab33_scpHeap {
    public static void main(String[] args) {
        String name = "The Testing Academy"; // in SCP 1 string
        String name1 = "The Testing Academy"; // in SCP 1 string

        String name2 = new String("The Testing Academy"); // Heap area (OA)

//        System.out.println(name == name1); // Check for the Ref
//        System.out.println(name.equals(name1)); // Check for the Content


        System.out.println(name1 == name2); // Check for the Ref
        System.out.println(name1.equals(name2)); // Check for the Content
    }
}
