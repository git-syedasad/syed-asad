import java.util.Scanner;
public class oddeven {
public static void main(String args[])
{
	int num=0;
	System.out.println("ENTER THE NUMBER:");
	Scanner number=new Scanner(System.in);
	num=number.nextInt();
	 if(num%3==0)
	 {
		 System.out.println("THE NUMBER IS EVEN");
	 } else {			System.out.println("THE NUMBER IS ODD"); 


	 }
	 
}
}
