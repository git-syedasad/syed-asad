import java.util.Scanner;
public class Whileloop {
public static void main(String[] args) {
	int sum=0; 
Scanner reader=new Scanner(System.in);
	System.out.println("please enter a number below 10");
	int num=reader.nextInt();
	while(num<=10)
	{
		sum=sum+num;
		num++;
		}
	System.out.format(" Sum of the Numbers From the While Loop is: %d ",
			sum);
}
}
