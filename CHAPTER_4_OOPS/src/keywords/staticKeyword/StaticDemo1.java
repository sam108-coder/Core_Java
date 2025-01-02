package keywords.staticKeyword;

class Employee {
    int empId;
    String empName;
    static String empCompanyName = "Programming World";

    Employee(int empId1, String empName1) {
        this.empId = empId1;
        this.empName = empName1;
    }

    void display() {
        System.out.println("----------Employee Details----------");
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee Company Name : " + empCompanyName);
    }

}

public class StaticDemo1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Deepak");
        Employee e2 = new Employee(102, "Deepesh");
        Employee e3 = new Employee(103, "Rahul");

        e1.display();
        e2.display();
        e3.display();

    }
}
