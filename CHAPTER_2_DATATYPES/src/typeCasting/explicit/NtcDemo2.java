package typeCasting.explicit;

public class NtcDemo2 {
    public static void main(String[] args) {
        byte no1=10;
        byte no2=20;
     //   byte res1=(byte) no1+no2;
    //    byte res2=(byte) no1 +(byte) no2;
        byte res3=(byte) (no1+no2);

        int no3=10;
        short no4=(byte)(short) no3;
    }
}
