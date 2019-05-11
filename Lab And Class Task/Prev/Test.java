public class Test
{
    public static void main(String arg[])
    {
        Account a1 = new Account("Boltu", "101.103.10001");
        a1.deposit(10000);
        a1.withdraw(15000);
        a1.display();

        SavingAccount s1 = new SavingAccount("James Bond", "101.103.10001");
        s1.deposit(5000);
        s1.withdraw(10000);
        s1.display();
    }
}