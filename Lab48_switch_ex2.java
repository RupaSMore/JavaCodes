package Ex_20042025;

import java.util.Scanner;

public class Lab48_switch_ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your browser name");
        String browserName = sc.next();
        browserName = browserName.toLowerCase();

        switch (browserName){
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;

            case "firefox":
                System.out.println("Starting the firefox browser");
                break;

            case "edge":
                System.out.println("Execute the Edge Code");
                break;

            default:
                System.out.println("I have not idea which browser is this");
                break;

        }

        }

    }

