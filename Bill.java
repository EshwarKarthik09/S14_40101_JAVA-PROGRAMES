//print Total cost of items 
import java.lang.*;
public class Bill
{
public static void main(String args[])
{
int a = 45000; // store 45000 in variable a 
int b = 500; // store 500 in  variable b 
int c = 1500; // store 1500 in variable c 
int total_cost = a+b+c;
int gst = (total_cost*18)%100;
int final_cost = total_cost+gst;
System.out.println("Total cost = "+total_cost);
System.out.println("Gst = "+gst);
System.out.println("Final cost = "+final_cost);
}
}