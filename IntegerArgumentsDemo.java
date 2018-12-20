import java.util.Scanner;

public class IntegerArgumentsDemo {

    public void AddNumber()
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int total=0;

            while (num != 0) {
                total += num;
                num = sc.nextInt();
            }
            System.out.print(" "+total);
    }

    public static void main(String []args)
    {
        IntegerArgumentsDemo ref=new IntegerArgumentsDemo();
        ref.AddNumber();
    }
}
