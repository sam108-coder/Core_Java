package throwKeyword;

public class Voting {
    public static void main(String[] args) {
        int age = 10;
        Voting v = new Voting();
        v.checkAge(age);
    }

    void checkAge(int age) {
        if (age >= 18) {
            youCanVote();
        } else {
            throw new RuntimeException("You Can not Vote");
        }
    }

    void youCanVote() {
        System.out.println("You Can Vote Successfully");
    }
}
