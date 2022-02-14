import java.util.Scanner;
public class Hypothesis {
public static void main(String args[])
{
	Scanner reader=new Scanner(System.in);
	System.out.println("enter the value of A");
	int a=reader.nextInt();
	System.out.println("enter the value of B");
	int b=reader.nextInt();
	double c=Math.sqrt(a*a+b*b);
	System.out.println("the value of hypothesis is = "+c);
	}
}