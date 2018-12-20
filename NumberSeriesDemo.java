import java.util.Scanner;

public class NumberSeriesDemo {

    public void PrintOutput()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+i);
            }
        }
    }
    public static void main(String []args)
    {
        NumberSeriesDemo ref=new NumberSeriesDemo();
        ref.PrintOutput();
    }
}
