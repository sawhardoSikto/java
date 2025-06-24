public class Account
{
    private String accno;
    private String balance;
    public Account(String accno,String balance)
    {
        this.accno=accno;
        this.balance=balance;
    }
    public String getAccno()
    {
        return accno;
    }
    public String getBalance()
    {
        return balance;
    }

}
