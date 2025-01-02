package controlstatement.switchExample;

public class SwitchDemo2 {
    public static void main(String[] args) {
        String name = "Sammy";

        switch (name) {
            case "Amit":
                System.out.println("101");
                break;
            case "Deepesh":
                System.out.println("102");
                break;
            case "Sammy":
                System.out.println("103");
                break;
            case "Rahul":
                System.out.println("104");
                break;
            default:
                System.out.println("Invalid Name");
                break;

        }
    }
}
