import java.util.Scanner;
public class Addition {
	public static void main(String args[])
	{
		System.out.println("ENTER THE TWO NUMBERS:");
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		int j=scan.nextInt();
		int sum=i+j;
		System.out.println("ADDITION OF TWO NUMBERS IS="+sum);
	}
	

}
