package listInterface.stack;

import java.util.Stack;

public class Test2 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("aaa");
        s.push("bbb");
        s.push("ccc");
        s.push("ddd");
        System.out.println(s.search("ddd"));
        System.out.println(s.search("zzz"));

        System.out.println(s.empty());
        s.clear();
        System.out.println(s.empty());
    }
}
