import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your total rent");
        int tk =sc.nextInt();


        Rent r1=new Rent();
        Rent r2=new Rent();
        Rent r3=new Rent();
        Rent r4=new Rent();
        r1.setName("Sikto & Bikash");
        r1.setTotalBalance(tk);
        r1.set(3875,700,135);
        r1.print();
        System.out.println("*********************");
        r2.setName("Faysal");
        r2.setTotalBalance(tk);
        r2.set(3375,700,135);
        r2.print();
        System.out.println("*********************");
        r3.setName("Shanto & soham");
        r3.setTotalBalance(tk);
        r3.set(3250,700,135);
        r3.print();
        System.out.println("*********************");
        r4.setName("sajal & tanvir");
        r4.setTotalBalance(tk);
        r4.set(2000,700,135);
        r4.print();

    }
}