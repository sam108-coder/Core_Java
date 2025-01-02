package keywords.thisKeyword;

public class Student {

    int rollNo;
    String name;

    Student(int rollNo1, String name1) {
        this.rollNo = rollNo1;
        this.name = name1;
    }

    void show() {
        System.out.println("Student RollNo : " + rollNo);
        System.out.println("Student Name : " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Deepak");
        s1.show();
    }
}
