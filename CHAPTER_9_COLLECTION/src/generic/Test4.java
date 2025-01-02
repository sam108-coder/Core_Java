package generic;

class A1<T extends Number & Runnable>{
    void show(T t){
        System.out.println(t);
    }
}
public class Test4 {
    public static void main(String[] args) {
    //    A1<Integer> ob=new A1<Integer>();
    //    ob.show(101);

    //    A1<Float> ob2=new A1<Float>();
    //    ob2.show(100f);

//        A1<String> ob3=new A1<String>();
//        ob3.show("amit");

    }
}
