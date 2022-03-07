import java.util.Scanner;

public class PrimeNumber2 {
public static void main(String[] args) {
	boolean isPrime=true;
	Scanner reader=new Scanner(System.in);
	System.out.println("enter any number : ");
	int num=reader.nextInt();
	reader.close();
	for(int i=2;i<num/2;i++) {
		if(num%i==0) {
			isPrime=false;
			break;
		}
	}
	if(isPrime) {
		System.out.println(num+ " is a prime number");
	}
	else {
		System.out.println(num+ " is not a prime number");
	}
}
}