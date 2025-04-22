package Ex_22042025;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class Lab80_switch_shortCodeCountry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the short code of country");
        String code= sc.next();
        String C_code= code.toUpperCase();

        switch (C_code){
            case "IN":
                System.out.println("India");
                break;
            case "AL":
                System.out.println("Albania");
                break;
            case "AU":
                System.out.println("Australia");
                break;
            case "BE":
                System.out.println("Belgium");
                break;
            case "BR":
                System.out.println("Brazil");
                break;
            case "CA":
                System.out.println("Canada");
                break;
            case "FR":
                System.out.println("France");
                break;
            default:
                System.out.println("not in list");
        }
    }
}
