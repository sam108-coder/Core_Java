package controlstatement.continuestmt;

public class ContinueDemo2 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==3){
                System.out.println(i);
                continue;
            //    System.out.println(i);  // unreachable statement
            }
        }
    }
}
