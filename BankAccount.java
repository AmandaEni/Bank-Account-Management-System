public class BankAccount{
    private double balance;
    private String clientName;

    public BankAccount(String ClientName){
        clientName = ClientName;
        balance = 0;
    }

    public BankAccount(String ClientName, double newBalance){
        clientName = ClientName;
        balance = newBalance;
    }

    public double getBalance(){
        return balance;
    }

    public boolean deposit(double amount){
        if (amount < 0)
            return false;
        else
            balance += amount;
            return true;
    }

    public boolean withdraw(double amount){
        if ((amount > balance) || (amount < 0))
            return false;
        else
            balance = balance - amount;
            return true;
    }

    public boolean transfer(double amount, BankAccount other){
        if ((amount > balance) || (amount < 0))
            return false;
        else
            balance = balance - amount;
            other.balance += amount;
            return true;
    }

    public String toString(){
        String helper = "client name: " + clientName + "\nbalance: " + balance;
        return helper;
    }

    public boolean isEqual(BankAccount other){
        if (balance == other.balance)
            return true;
        else
            return false;
    }
}
