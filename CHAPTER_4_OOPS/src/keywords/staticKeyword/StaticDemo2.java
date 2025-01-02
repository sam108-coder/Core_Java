package keywords.staticKeyword;


class PageVistors{
    static int count=0;
    PageVistors(){
        count= count+1;
        System.out.println("Vistors : "+count);
    }
    void noOfVistors(){
        System.out.println(count);
    }
}
public class StaticDemo2 {
    public static void main(String[] args) {
        PageVistors v1=new PageVistors();
        PageVistors v2=new PageVistors();
        PageVistors v3=new PageVistors();
        PageVistors v4=new PageVistors();
        PageVistors v5=new PageVistors();
        v1.noOfVistors();
    }
}
