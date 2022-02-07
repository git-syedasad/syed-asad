import java.util.Scanner;
public class swaptwonumbers {
public static void main(String args[])
{
	Scanner reader=new Scanner(System.in);
	System.out.println("enter the first number");
	long first=reader.nextLong();
	System.out.println("enter the secong number");
	long second=reader.nextLong();
	System.out.println("--before swap--");
	System.out.println("first number"+first);
	System.out.println("second number"+second);
	long temporary=first;
	first=second;
	second=temporary;
	System.out.println("***********************");
	System.out.println("--after swap--");
	System.out.println("first number"+first);
	System.out.println("second number"+second);
}
}
