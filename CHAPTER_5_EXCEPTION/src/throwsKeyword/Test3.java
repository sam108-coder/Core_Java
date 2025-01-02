package throwsKeyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test3 {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis=new FileInputStream("");
/*
        try {
            int a = 10/0;
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("sami");

        }
       // System.out.println(a);*/
    }
}
