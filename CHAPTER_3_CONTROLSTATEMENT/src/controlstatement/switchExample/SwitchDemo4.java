package controlstatement.switchExample;

public class SwitchDemo4 {
    public static void main(String[] args) {
        String name = "deepak";

        final String name1 = "amit";
        final String name2 = "deepesh";
        final String name3 = "deepak";
        final String name4 = "rahul";

        switch (name) {
            case name1:
                System.out.println("101");
            case name2:
                System.out.println("102");
            case name3:
                System.out.println("103");
            case name4:
                System.out.println("104");
            default:
                System.out.println("Invalid Name");
        }
    }
}
