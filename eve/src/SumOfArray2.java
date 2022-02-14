import java.util.Scanner;
public class SumOfArray2 {
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.println("enter the numbers");
	int arr[]=new int[5];
	int sum=0;
	for(int i=0;i<5;i++) {
		arr[i]=reader.nextInt();
	}
	for(int num:arr) {
		sum=sum+num;
	}
	System.out.println("the sum of the given numbers is : "+sum);
}
}
