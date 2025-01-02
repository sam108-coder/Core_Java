package has_A_Relationship;
class Employee {
    String empId;
    String empName;

    Address addr;

    Employee(String empId1, String empName1, Address addr1) {
        this.empId = empId1;
        this.empName = empName1;
        this.addr = addr1;
    }

    void showEmpDetails() {
        System.out.println("-----------------------------------");
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("-----Employee Address-----");

        System.out.println("Location : " + addr.location);
        System.out.println("City : " + addr.city);
        System.out.println("State : " + addr.state);
    }
}

class Address {
    String location;
    String city;
    String state;

    Address(String location1, String city1, String state1) {
        this.location = location1;
        this.city = city1;
        this.state = state1;

    }

}


public class OneToOneDemo {
    public static void main(String[] args) {
        Address ad1 = new Address("#101,sector1", "Bangalore", "Karnataka");
        Employee emp1 = new Employee("101", "deepak", ad1);
        emp1.showEmpDetails();

        Address ad2 = new Address("#102,sector2", "Faridabad", "Haryana");
        Employee emp2 = new Employee("102", "deepesh", ad2);
        emp2.showEmpDetails();
    }
}
