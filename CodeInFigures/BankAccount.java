public class BankAccount
{
    private int acctNum;
    private double balance;
    BankAccount(int num, double bal)
    {
        acctNum = num;
        balance = bal;
    }

    @Override
    public String toString()
    {
        return "BankAccount acctNum = " + acctNum + "   Balance = $" + balance;
    }

    boolean equals(BankAccount secondAcct)
    {
        boolean result;
        result = acctNum == secondAcct.acctNum && balance == secondAcct.balance;
        return result;
    }
}