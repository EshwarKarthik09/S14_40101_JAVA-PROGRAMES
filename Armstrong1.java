import java.util.Scanner;
public class Armstrong1
{
public static void main(String args[])
{
int no,temp,x,rev=0;
Scanner scanner = new Scanner(System.in);
System.out.println(" pls give any number");
no = scanner.nextInt();
temp = no;
while(no>0)
{
x=no%10;
rev=rev+(x*x*x);
no=no/10;
}
if (rev==temp)
{
System.out.println("the entered numbr "+temp+" is armstong ");
}
else
{
System.out.println("the entered numbr "+temp+" is not armstong ");
}
}
}