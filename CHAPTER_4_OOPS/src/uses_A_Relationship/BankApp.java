package uses_A_Relationship;

class Account {
    String accNo;
    String name;
    int balance;

    Account(String accNo1, String name1, int balance1) {
        this.accNo = accNo1;
        this.name = name1;
        this.balance = balance1;
    }
}

class Transaction {
    void deposit(Account account, int amount) {
        account.balance = account.balance + amount;
        System.out.println("Amount Deposited Successfully");
        System.out.println("Name : " + account.name);
        System.out.println("Account No : " + account.accNo);
        System.out.println("Total Balance : " + account.balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        Account ob1 = new Account("23434", "Deepak", 100000);
        Transaction ob2 = new Transaction();
        ob2.deposit(ob1, 5000);
    }
}
