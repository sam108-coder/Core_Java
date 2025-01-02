package controlstatement.switchExample;

public class SwitchDemo1 {
    public static void main(String[] args) {
        int rollNo = 103;
        switch (rollNo) {
            case 101:
                System.out.println("Amit");
                break;
            case 102:
                System.out.println("Deepesh");
                break;
            case 103:
                System.out.println("Sammy");
                break;
            case 104:
                System.out.println("Rahul");
                break;
            default:
                System.out.println("Invalid Roll No");
                break;
        }
    }
}
