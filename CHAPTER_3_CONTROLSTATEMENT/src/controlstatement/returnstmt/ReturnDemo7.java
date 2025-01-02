package controlstatement.returnstmt;

public class ReturnDemo7 {
    public static void main(String[] args) {
        ReturnDemo7 obj=new ReturnDemo7();
        obj.m1();
    }
    int m1(){
        System.out.println("hi");
        return 10;
    //    System.out.println("hello"); // Unreachable statement
    }

}
