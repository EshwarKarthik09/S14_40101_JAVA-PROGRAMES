import java.util.Scanner;
public class ArraySumAverage
{
public static void main(String args[])
{
int[] arr = new int[5];
int sum = 0;
double average;

Scanner scanner = new Scanner(System.in);
System.out.println(" Enter the Array values : ");

for (int i = 0; i < arr.length; i++)
{
arr[i] = scanner.nextInt();
sum = sum + arr[i];
}

average = (double)sum / arr.length;

System.out.println("Sum of Array elements = " + sum);
System.out.println("Average of Array elements = " + average);

scanner.close();
}
}