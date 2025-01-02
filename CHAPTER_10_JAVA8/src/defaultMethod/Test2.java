package defaultMethod;

interface DbDriver {
    void getDriverClass();

    void getDriverUrl();

    default void getDriverDeatils() {
        System.out.println("Driver Details");
    }
}

class MySqlConnection implements DbDriver {

    @Override
    public void getDriverClass() {
        System.out.println("com.mysql.jdbc.Driver");
    }

    @Override
    public void getDriverUrl() {
        System.out.println("jdbc:mysql://localhost:3306/db_demo");
    }
}

class OracleConnection implements DbDriver {

    @Override
    public void getDriverClass() {
        System.out.println("oracle.jdbc.oracleDriver");
    }

    @Override
    public void getDriverUrl() {
        System.out.println("jdbc:oracle:thin:@localhost:1521:Xe");
    }
}

public class Test2 {
    public static void main(String[] args) {
        MySqlConnection mysql = new MySqlConnection();
        mysql.getDriverDeatils();
        mysql.getDriverClass();
        mysql.getDriverUrl();

        System.out.println("------------------------------------------");

        OracleConnection oc = new OracleConnection();
        oc.getDriverDeatils();
        oc.getDriverClass();
        oc.getDriverUrl();


    }
}
