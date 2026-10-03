import java.util.Scanner;

public class Fibonacci
{
static void fibonacci(int n)
{
 int a = 0, b = 1,c;
System.out.println("Fibonacci series : ");
for(int i = 0; i <= n; i++){
System.out.print(a + " ");
c = a + b;
a = b;
b = c;
}
}
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Eenter the number of terms : ");
int n = scanner.nextInt();
fibonacci(n);
}
}
