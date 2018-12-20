import java.util.Scanner;

public class OriginalNumberDemo {

    public void numberguessed()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n>1 && n<50)||(n>1 && n<100))
        {
            System.out.print("Number guessed matches the original number");
        }
        else if(n<1)
        {
            System.out.print("Number guessed is less than original number");
        }
        else if(n>100)
        {
            System.out.print("Number guessed is more than original number");
        }
    }
    public static void main(String []args)
    {
        OriginalNumberDemo ref=new OriginalNumberDemo();
        ref.numberguessed();
    }
}
