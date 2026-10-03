import java.util.Scanner;
public class Armstrong
{
public static void main(String args[])
{
int no,temp,x,rev=0;
Scanner scanner = new Scanner(System.in);
for(int num = 1; num <= 1000; num++)
{
 no = num;
 temp = no;
 rev = 0;
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
}
}
}