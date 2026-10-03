public class Convertion
{
public static void main(String[] args)
{
Scanner Sc = new Scanner(System.in);
// char as an input
System.out.println("Enter a character: ");
char ch = sc.next().charAt(0);
int ascii = (int) ch;
System.out.println("The ASCII value of " +ch+ " is: " + ascii);
}
}