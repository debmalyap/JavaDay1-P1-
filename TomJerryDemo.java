import java.util.Scanner;

public class TomJerryDemo{

    static Scanner sc=new Scanner(System.in);
    public void checkInput()
    {
        int num=sc.nextInt();
        if((num%2!=0) && (num >20 && num<30)) {
            System.out.println("Tom");
        }
        else if((num%2==0) && (num >20 && num<30)) {
            System.out.println("Jerry");
        }
        else
        {
            System.out.println("Doesn't exist");
        }
    }

    public static void main(String []args)
    {
        TomJerryDemo ref=new TomJerryDemo();
        ref.checkInput();
    }
}
