package constructor;

class Student {
    int rollNo;
    String name;

    Student(int rollNo1, String name1) {
        this.rollNo = rollNo1;
        this.name = name1;
    }

    void show() {
        System.out.println("RollNo : " + rollNo + " & Name : " + name);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(101, "deepak");
        Student s2 = new Student(102, "deepesh");
        Student s3 = new Student(103, "amit");
        s1.show();
        s2.show();
        s3.show();
    }
}
