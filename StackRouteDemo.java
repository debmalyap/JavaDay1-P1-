import java.util.Scanner;

public class StackRouteDemo {

    public void outputstring()
    {
        Scanner sc=new Scanner(System.in);
        String ip1=sc.next();//enter the string
        int ip2=sc.nextInt(),l=ip1.length();//enter the integer
        String demo=" ";
        for(int i=0;i<l;i++)
        {
            for (int j = (l - ip2); j < l; j++)
            {
                demo = demo + ip1.charAt(j);
            }
        }
        String fs=ip1+demo;
        System.out.print(fs.trim());


    }
    public static void main(String []args)
    {
        StackRouteDemo ref=new StackRouteDemo();
        ref.outputstring();
    }
}
