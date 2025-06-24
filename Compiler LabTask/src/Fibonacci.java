import java.util.Scanner;

public class Fibonacci
{
    int fibo(int n)
    {
        if (n<2)
        {
            return  2;

        }
        else {
           return fibo(fibo(n-1) + fibo(n-2));

        }

    }
    public static void main (String []args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Fibonacci f1=new Fibonacci();
        System.out.println(f1.fibo(n));
    }
}
