package listInterface.stack;

import java.util.Stack;

public class Test1 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("aaa");
        s.push("bbb");
        s.push("ccc");
        s.push("ddd");
        System.out.println(s);

        System.out.println(s.peek());
        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.pop());
    }
}
