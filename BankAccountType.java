public class BankAccountType extends BankAccount{
    private int accountType = 1;

    public BankAccountType(String ClientName){
        super(ClientName);
    }
    public BankAccountType(String ClientName, int AccountType){
        super(ClientName);
        if ((AccountType == 1) || (AccountType == 2))
            this.accountType = AccountType;
    }
    public BankAccountType(String ClientName, double balance, int AccountType){
        super(ClientName, balance);
        if ((AccountType == 1) || (AccountType == 2))
            this.accountType = AccountType;
    }
    public int getAccountType(){
        return this.accountType;
    }
    public boolean setAccountType(int accountType){
        if (accountType == this.accountType){
            return false;
        }
        else if ((accountType == 1) || (accountType == 2)){
            this.accountType = accountType;
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString(){
        String helper;
        if (this.accountType == 1)
            helper = "checking";
        else
            helper = "saving";
        return super.toString() + "\naccount type: " + helper;
    }
    public boolean hasSameAccountType(BankAccountType other){
        return (other.getAccountType() == this.getAccountType());
    }
}
