public class SavingAccount extends Account
{
    private double interestRate;
    public SavingAccount(String aT, String aN)
    {
        super(aT, aN);
        super.accountBalance = 500;
        this.interestRate = 10;
    }
    
    public boolean deposit(double amount )
    {
        if(amount >= 50 && amount <= 100000)
        { 
            accountBalance = accountBalance+ amount;
            return true;
        }
        return false;
    }
    
    
    public boolean withdraw(double amount)
    {
        if(amount >= 500 && amount <= 20000)
        {
            accountBalance = accountBalance-amount;
            return true;
        }
        return false;
    }

    public void display()
    {
        String displayString;
        displayString = 
        "Account Detail ---------\n"+
        "Title: "+accountTitle+"\n"+
        "Account Number: "+accountNumber+"\n"+
        "Interest Rate: "+interestRate+"\n"+
        "Current Balance: "+ accountBalance+"\n"+
        "-------------------";
        System.out.print(displayString);
    }

}