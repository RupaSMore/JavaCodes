package Ex_26042025;

public class Lab104_splitStringEx2 {
    public static void main(String[] args) {
        String str = "12-08-2024";
        String[] strArr = str.split("-");

        System.out.println("string is-> '" + str+"'");
        System.out.println("there are total "+ strArr.length + " word separated by -");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
            int l = strArr[i].length();
        }
    }
}
