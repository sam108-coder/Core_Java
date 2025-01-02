package mapInterface.treeMap;

import java.util.Comparator;
import java.util.TreeMap;

class NameComparision implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1= (Integer) o1;
        Integer i2= (Integer) o2;
        return i1.compareTo(i2);

      /*  String str1= (String) o1;
        String str2= (String) o2;
        return str1.compareTo(str2);*/
    }
}
public class Test2 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(106, "priya");
        tm.put(101, "deepak");
        tm.put(103, "amit");
        tm.put(102, "rahul");
        tm.put(105, "kamal");
        tm.put(104, "deepesh");
        System.out.println(tm);
    }
}
