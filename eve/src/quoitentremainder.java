
import java.util.Scanner;
public class quoitentremainder {
public static void main(String args[])
{
Scanner reader=new Scanner(System.in);
System.out.println("ENTER THE DIVIDEND - ");
int dividend=reader.nextInt();
System.out.println("ENTER THE DIVISOR - ");
int divisor=reader.nextInt();
int quoitent=dividend/divisor;
	int remainder=dividend%divisor;
	System.out.println("THE QUOITENT IS = "+quoitent);
	System.out.println("THE REMAINDER IS = "+remainder);
}
}
