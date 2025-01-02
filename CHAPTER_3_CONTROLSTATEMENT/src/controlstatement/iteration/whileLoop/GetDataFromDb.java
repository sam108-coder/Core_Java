package controlstatement.iteration.whileLoop;


public class GetDataFromDb {
    public static void main(String[] args) {
    ResultSetDemo rs=new ResultSetDemo();
    while(rs.next()){
        //print all rows one by one
    }

    }
}
class ResultSetDemo{
    boolean next(){
        // get rows from database
        return true;
    }
}
