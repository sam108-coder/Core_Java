package has_A_Relationship;

class Student {
    String studentId;
    String studentName;

    Courses[] courses;

    Student(String studentId1, String studentName1, Courses[] courses1) {
        this.studentId = studentId1;
        this.studentName = studentName1;
        this.courses = courses1;

    }

    void getStudentDeatials() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("-----Student Courses Details-----");

        for (int i = 0; i < courses.length; i++) {
            System.out.println("Course" + (i + 1) + " : " + " courseId : " + courses[i].courseId + " & Course Name : " + courses[i].courseName);
        }
    }
}

class Courses {
    String courseId;
    String courseName;

    Courses(String courseId1, String courseName1) {
        this.courseId = courseId1;
        this.courseName = courseName1;

    }
}


public class OneToManyDemo {
    public static void main(String[] args) {

        System.out.println("-----First Student-----");
        Courses c1 = new Courses("J1", "Java");
        Courses c2 = new Courses("Py1", "Python");
        Courses c3 = new Courses("M1", "MySQL");
        Courses[] courses1 = {c1, c2, c3};
        Student s1 = new Student("101", "deepak", courses1);
        s1.getStudentDeatials();

        System.out.println("-----Second Student-----");
        Courses c4 = new Courses("Ph1", "PHP");
        Courses c5 = new Courses("H2", "HTML");
        Courses[] courses2 = {c4, c5};
        Student s2 = new Student("102", "deepesh", courses2);
        s2.getStudentDeatials();


    }
}
