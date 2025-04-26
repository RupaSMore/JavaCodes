package Ex_26042025;

public class Lab105_reverseStringProgram {
    public static void main(String[] args) {
        String str= "Rupali";
        String reverse="";
        int length=str.length();
        for (int i = length-1; i >=0 ; i--) {
            reverse=reverse+str.charAt(i);
        }
        System.out.println("given string-> " +str);
        System.out.println("reverse string ->" +reverse);
    }
}
