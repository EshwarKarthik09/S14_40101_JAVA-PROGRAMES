import java.util.Scanner;
public class FahrenheitToCelcius
{
public static void main(String args[])
   {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter temperature in Fahrenheit: ");
  double Fahrenheit = sc.nextDouble();
  double Celsius = (Fahrenheit - 32)*5/9;
   System.out.println("temperature in Celsius: " + Celsius);
 sc.close();
}
}
