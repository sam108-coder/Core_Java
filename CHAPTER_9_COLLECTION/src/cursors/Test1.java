package cursors;

import java.util.ArrayList;

public class Test1 {
    String name;
    int id;

    @Override
    public String toString() {
        return "Test1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.name = "deepak";
        t1.id = 101;
        System.out.println(t1);


        ArrayList al = new ArrayList();
        al.add("aaa");
        al.add("bbb");
        al.add("ccc");
        al.add("ddd");
        System.out.println(al);
    }


}
