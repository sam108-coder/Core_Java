package comparator;

import java.util.TreeSet;

class Student1 implements Comparable {
    int rollNo;
    String name;

    public Student1(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Student1 st = (Student1) o;
        //    return -this.name.compareTo(st.name);
        return 0;
    }

    public String toString() {
        return rollNo + "-" + name;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "aaa");
        Student1 s2 = new Student1(102, "fff");
        Student1 s3 = new Student1(103, "ddd");
        Student1 s4 = new Student1(104, "kkk");
        Student1 s5 = new Student1(105, "eee");

        TreeSet ts = new TreeSet();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        System.out.println(ts);
    }
}
