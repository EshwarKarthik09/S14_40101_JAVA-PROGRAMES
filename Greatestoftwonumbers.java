import java.util.Scanner;
public class Greatestoftwonumbers{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
System.out.print(" Enter a = ");
int a = scanner.nextInt();
System.out.print(" Enter b = ");
int b = scanner.nextInt();
scanner.close();
if (a>b)
{
System.out.println(" a is grater ");
}
else
{
System.out.println(" b is grater ");
}
}
}