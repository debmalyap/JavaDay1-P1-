import java.util.Scanner;

public class VowelCheck {

    static Scanner sc=new Scanner(System.in);

    public void CheckCharacter()
    {
        System.out.println("Enter a word:");
        String st=sc.next();
        char ar[]=st.toCharArray();
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]=='a'||ar[i]=='A'||ar[i]=='e'||ar[i]=='E'||ar[i]=='i'||ar[i]=='I'||ar[i]=='o'||ar[i]=='O'||ar[i]=='u'||ar[i]=='U')
            {
                System.out.print(" Vowel");
            }
            else
            {
                System.out.print(" Consonant");
            }
        }

    }
    public static void main(String []args)
    {
        VowelCheck ref=new VowelCheck();
        ref.CheckCharacter();
    }
}
