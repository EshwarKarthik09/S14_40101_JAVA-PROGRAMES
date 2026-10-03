import java.util.Scanner;
public class Firstandlastelements
{
public static void main(String args[])
{
int[] arr = new int[5];
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the Array values : ");
for (int i = 0; i < arr.length; i++)
{
arr[i] = scanner.nextInt();
}
System.out.println(" The first element is : ");
System.out.println(arr[0]);
System.out.println(" The last element is : ");
System.out.println(arr[arr.length - 1]);

scanner.close();
}
}