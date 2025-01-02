package controlstatement.breakStmt;

public class BreakDemo2 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==3){
                System.out.println(i);
                break;
            //    System.out.println("hi"); // unreachable statement
            }
        }
        System.out.println("hello");
    }
}
