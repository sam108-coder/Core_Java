package generic;

import java.util.ArrayList;

class A2 {
    void show(ArrayList<?> al) {
        System.out.println(al);
    }
}

public class Test5 {
    public static void main(String[] args) {
        A2 ob1 = new A2();
        ArrayList<String> al = new ArrayList<String>();
        ob1.show(al);

        ArrayList<Integer> all = new ArrayList<Integer>();
        ob1.show(all);

    }
}
