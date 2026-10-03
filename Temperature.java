import java.util.Scanner;

public class Temperature 
{
    public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);

System.out.print("Enter temp of fahrenheit : ");
        int fahrenheit = sc.nextInt();

System.out.print("Enter temp of celsius : ");
        float celsius = (fahrenheit * 9/5)+ 32;

System.out.println("Fahrenheit to Celsius= " + celsius );
}
}