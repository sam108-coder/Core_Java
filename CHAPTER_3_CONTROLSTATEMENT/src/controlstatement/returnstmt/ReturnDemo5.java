package controlstatement.returnstmt;

public class ReturnDemo5 {
    public static void main(String[] args) {
        ReturnDemo5 obj=new ReturnDemo5();
        System.out.println(obj.m1());
        obj.m2();
     //   System.out.println(obj.m2()); // error
    }

    int m1(){
        return 10;
    }

    void m2(){
        System.out.println("hi");
    }


}
