package Ex_20042025;

public class Lab50_switchMultiCondtion {
    public static void main(String[] args) {
        int itemcode  = 007;
        switch (itemcode) {
            case 001, 002, 003:
                System.out.println("It is Electronic Gadget!");
                break;
            case 004, 005, 007:
                System.out.println("It is Mechinal Gadget!");
                break;
            default:
                System.out.println("None");
        }
        }
}
