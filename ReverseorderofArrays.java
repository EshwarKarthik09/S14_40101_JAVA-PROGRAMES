import java.util.Scanner;
public class ReverseorderofArrays
{
public static void main(String argss[])
{
int[] arr = new int[5];
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the Array values : ");
for (int i = 0; i < arr.length; i++)
{
arr[i] = scanner.nextInt();
}
System.out.println("The reverse order of Array values are : ");
for (int i = 0; i < arr.length; i++)
{
System.out.println(arr[arr.length - 1 - i]);
}
scanner.close();
}
}