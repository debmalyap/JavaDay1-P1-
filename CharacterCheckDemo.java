import java.util.Scanner;

public class CharacterCheckDemo {

    public void CheckCharacter()
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);

        if(c>=65 && c<=90)

            System.out.print(" Capital letter");

        else if(c>=97 && c<=122)

            System.out.print(" Small letter");


        else if(c>=48 && c<=57)

            System.out.print(" Digit");

        else if ((c>0 && c<=47)||(c>=58 && c<=64)||(c>=91 && c<=96)||(c>=123 && c<=127))
            System.out.print(" Special symbol");
    }

    public static void main(String []args)
    {
        CharacterCheckDemo ref=new CharacterCheckDemo();
        ref.CheckCharacter();
    }
}
