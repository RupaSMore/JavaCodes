package Ex_26042025;

public class Lab103_splitStringEx1 {
    public static void main(String[] args) {
        String str="This is a java program";
        String[] splitStr= str.split(" ");

        for (int i = 0; i < splitStr.length; i++) {
           // System.out.println(splitStr[i]);
            int l=splitStr[i].length();
            if(splitStr[i].charAt(l-1)=='s')
            {
                System.out.println(splitStr[i]);
            }

        }
    }
}
