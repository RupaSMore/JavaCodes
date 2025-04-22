package Ex_22042025;

import com.sun.source.tree.CaseTree;

import java.lang.runtime.SwitchBootstraps;

public class Lab79_arithmaticOperationsUsingSwitch {
    public static void main(String[] args) {
        int a= 10;
        int b=20;
        int c;

        String operation ="az";

        switch (operation)
        {
            case "add": c=a+b;
                System.out.println("addition-> " +c);
                break;
            case"div": c=a/b;
                System.out.println("Division-> " +c);
                break;
            case "multi":c=a*b;
                System.out.println("Multiplication-> " +c);
                break;
            case "substract" :c=a-b;
                System.out.println("substraction-> " +c);
                break;
            default:
                System.out.println("wrong operation");
        }
    }
}
