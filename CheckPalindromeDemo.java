import java.util.Scanner;

public class CheckPalindromeDemo {

    static Scanner sc=new Scanner(System.in);
    public void checkpalindrome()
    {
        int n=sc.nextInt(),sum=0;
        String s=Integer.toString(n);
        char ar[]=s.toCharArray();
        String reverse=new StringBuffer(s).reverse().toString();
        if(s.equals(reverse))
        {
            System.out.print(n+ " is Palindrome ");
        }
        else
        {
            System.out.print(n+" is Not Palindrome ");
        }
        Integer ar2[]=new Integer[ar.length];
        for(int i=0;i<ar.length;i++)
        {
            ar2[i]=Character.getNumericValue(ar[i]);
        }

        for(int i=0;i<ar2.length;i++)
        {
            if(ar2[i]%2==0)
                sum +=ar2[i];
        }
        System.out.println();
        //System.out.print("Sum of even numbers :" +sum);
        System.out.println();
        if(sum>25)
        {
            System.out.print("and the sum of even numbers is greater than 25");
        }
        else
        {
            System.out.print("and the sum of even numbers is less than 25");
        }

    }

    public static void main(String []args)
    {
        CheckPalindromeDemo ob=new CheckPalindromeDemo();
        ob.checkpalindrome();
    }
}
