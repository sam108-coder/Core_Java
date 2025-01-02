package cursors.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class Test1 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("aaa");
        v.addElement("bbb");
        v.addElement("ccc");

        Enumeration e = v.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
