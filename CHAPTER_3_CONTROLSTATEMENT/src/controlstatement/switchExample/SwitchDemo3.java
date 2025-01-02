package controlstatement.switchExample;

public class SwitchDemo3 {
    public static void main(String[] args) {
        String name="deepak";

        switch (name){
            case "amit":
                System.out.println("101");
            case "deepesh":
                System.out.println("102");
            case "deepak":
                System.out.println("103");
            case "rahul":
                System.out.println("104");
            default:
                System.out.println("Invalid Name");


        }
    }
}
