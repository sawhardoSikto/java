public class Rent
{
    public double sum=0.0;
    private double totalBalance=-0.0;
    private String name;

    public Rent()
    {

    }
    public void setTotalBalance(double totalBalance)
    {
        this.totalBalance=totalBalance;
    }
    public double getTotalBalance()
    {
        return totalBalance;
    }
    public void setName(String name)
    {
        this.name=name;

    }
    public String getName()
    {
        return name;
    }
    public void set(double roomvara,double khalabill,double wifi)
    {
        double service_charge=(getTotalBalance()-25000)/8;
        sum=service_charge+roomvara+khalabill;

    }
    public double getSum()
    {
        return sum;
    }
    public void print ()
    {
        System.out.println(getName());
        System.out.println(getSum());
    }

}