package controlstatement.iteration.forLoop;

public class PrintTable {
    public static void main(String[] args) {
        int no = 10;

        for (int i = 1; i <= 10; i++) {
            System.out.println(no + "*" + i + "=" + (no * i));
        }
    }
}
