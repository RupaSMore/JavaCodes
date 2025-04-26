package Ex_26042025;

public class Lab102_splitString {
    public static void main(String[] args) {
        String str="This is a java program";
        String[] splitStr= str.split(" ");
        for (int i = 0; i < splitStr.length; i++) {
            System.out.println(splitStr[i]);

        }
    }
}
