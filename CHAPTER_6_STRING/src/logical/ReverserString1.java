package logical;

public class ReverserString1 {
    public static void main(String[] args) {
        String str1="abc xyz";
        // o/p cba zyx
        String[] words = str1.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:words){
            StringBuilder revWord=new StringBuilder(word);
            result.append(revWord.reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
