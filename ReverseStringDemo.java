import java.util.Scanner;

public class ReverseStringDemo {

    public void reversestring()
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ar1[]=str.toCharArray();
        for(int i=ar1.length-1;i>=0;i--)
            System.out.print(ar1[i]);
    }

    public static void main(String []args)
    {
        ReverseStringDemo ref=new ReverseStringDemo();
        ref.reversestring();
    }
}
