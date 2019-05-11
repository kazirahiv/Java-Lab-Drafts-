public class Account
{
    protected String accountTitle,
    accountNumber;
    protected double accountBalance;
    Account(String aT, String aN)
    {
        accountTitle = aT;
        accountNumber = aN;
        accountBalance = 0;
    }
    Account(String aT, String aN, double aB)
    {
        accountTitle = aT;
        accountNumber = aN;
        accountBalance = aB;
    }

    public boolean deposit(double amount )
    {
        accountBalance = accountBalance+ amount;
        return true;
    }

    public boolean withdraw(double amount)
    {

        accountBalance = accountBalance-amount;
        return true;
    }

    public void display()
    {
        String displayString;
        displayString = 
        "Account Detail ---------\n"+
        "Title: "+accountTitle+"\n"+
        "Account Number: "+accountNumber+"\n"+
        "Current Balance: "+ accountBalance+"\n"+
        "-------------------";
        System.out.print(displayString);
    }

}