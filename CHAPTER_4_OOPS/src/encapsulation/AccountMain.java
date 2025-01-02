package encapsulation;

class Account {
    private int amount;
    private String accNo;

    public void setAmount(int amount1) {
        this.amount = amount1;
    }

    public int getAmount() {
        return amount;
    }

    public void setAccNo(String accNo1) {
        this.accNo = accNo1;
    }

    public String getAccNo() {
        return accNo;
    }
}

class BankFunctions {
    void deposit(Account acc, int dptAmt) {
        int total = acc.getAmount() + dptAmt;
        acc.setAmount(total);
    }

    void withraw(Account acc, int wthAmt) {
        int total = acc.getAmount() - wthAmt;
        acc.setAmount(total);
    }
}

public class AccountMain {
    public static void main(String[] args) {
        Account ob1 = new Account();
        ob1.setAccNo("432132");
        ob1.setAmount(10000);

        BankFunctions bf = new BankFunctions();
        bf.deposit(ob1, 5000);
        bf.withraw(ob1, 3000);
        System.out.println("Full Details : " + ob1.getAccNo() + " : " + ob1.getAmount());
    }
}
