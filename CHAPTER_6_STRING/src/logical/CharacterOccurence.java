package logical;

public class CharacterOccurence {
    public static void main(String[] args) {

        String str = "Karnatka";
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(ch + " - " + count);
                str = str.replace(Character.toString(ch), "");
            }
        }
    }
}
