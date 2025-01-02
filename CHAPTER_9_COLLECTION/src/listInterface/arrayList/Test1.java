package listInterface.arrayList;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(1, 90);
        al.add(20);
        al.add(3, "amit");
        System.out.println(al);
    }
}
