package has_A_Relationship;

class Student1 {
    String rollNo;
    String name;
    Branch branch;

    Student1(String rollNo1, String name1, Branch branch1) {
        this.rollNo = rollNo1;
        this.name = name1;
        this.branch = branch1;
    }

    void getStudentDetails() {
        System.out.println("Student RollNo : " + rollNo);
        System.out.println("Student Name : " + name);
        System.out.println("Student Branch Code : " + branch.branchCode);
        System.out.println("Student Branch Name : " + branch.branchName);
    }

}

class Branch {
    String branchCode;
    String branchName;

    Branch(String branchCode1, String branchName1) {
        this.branchCode = branchCode1;
        this.branchName = branchName1;
    }
}

public class ManyToOneDemo {
    public static void main(String[] args) {
        Branch b1 = new Branch("CSE01", "CSE");
        Student1 s1 = new Student1("101", "deepak", b1);
        Student1 s2 = new Student1("102", "deepesh", b1);
        Student1 s3 = new Student1("103", "amit", b1);
        s1.getStudentDetails();
        s2.getStudentDetails();
        s3.getStudentDetails();
    }
}
