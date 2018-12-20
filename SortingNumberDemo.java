import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


public class SortingNumberDemo {

    public void sortingnumber()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        //Convert the integer number into an array//
        String str=(new Integer(n)).toString();
        char ar1[]=str.toCharArray();
        Integer ar2[]=new Integer[ar1.length];
        for(int i=0;i<ar1.length;i++)
        {
            ar2[i]=Character.getNumericValue(ar1[i]);
        }
        System.out.print("Sorted number in non-increasing order: ");
        Arrays.sort(ar2,Collections.reverseOrder());
        for(int i=0;i<ar2.length;i++)
        {
            System.out.print(ar2[i]);
        }
        //sum of even numbers from the array//
        for(int i=0;i<ar2.length;i++)
        {
            if(ar2[i]%2==0)
                sum +=ar2[i];
        }
        System.out.println();
        System.out.print("Sum of even numbers :" +sum);
        System.out.println();
        if(sum>15)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
    public static void main(String []args)
    {
        SortingNumberDemo ref=new SortingNumberDemo();
        ref.sortingnumber();
    }
}
