package controlstatement.returnstmt;

public class ReturnDemo3 {
    public static void main(String[] args) {
        ReturnDemo3 obj = new ReturnDemo3();
        int s = obj.m1();
        System.out.println(s);
    }

    private int m1() {
        int no1 = 10, no2 = 20;
        return no1 + no2;
    }
}
