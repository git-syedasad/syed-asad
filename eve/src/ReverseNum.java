import java.util.Scanner;
public class ReverseNum {
public static void main(String[] args) {
	int num=0;
	int reversenum=0;
	Scanner reader=new Scanner(System.in);
	System.out.println("please enter the number you wish to reverse : ");
num=reader.nextInt();
while(num!=0) {
	reversenum=reversenum*10;
	reversenum=reversenum+num%10;
	num=num/10;
	}
System.out.format("the reversed number is : %d ",reversenum);
}
}
