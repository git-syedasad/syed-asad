
public class largestnum {
public static void main(String args[])
{
	double num1=5.4,num2=6.3,num3=8.3;
	if(num1>=num2 && num1>=num3)
	{
		System.out.println(num1+ " IS THE LARGEST OF ALL NUMBERS");
	}
	else if(num2>=num1 && num2>=num3)
	{
		System.out.println(num2+ " IS THE LARGEST OF ALL NUMBERS");
	}
	else
	{
		System.out.println(num3+ " IS THE LARGEST OF ALL THE NUMBERS");
	}
}
}
