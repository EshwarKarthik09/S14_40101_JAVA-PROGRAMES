import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        int no, temp, x, rev = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number:");
        no = scanner.nextInt();

        temp = no;

        while(no > 0)
        {
            x = no % 10;
            rev = rev * 10 + x;
            no = no / 10;
        }

        if(rev == temp)
            System.out.println(temp + " is a palindrome number");
        else
            System.out.println(temp + " is not a palindrome number");
    }
}
