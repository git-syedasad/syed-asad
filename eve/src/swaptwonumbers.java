
public class swaptwonumbers {
public static void main(String args[])
{
	float first=5.2f,second=6.3f;
	System.out.println("--before swap--");
	System.out.println("first number"+first);
	System.out.println("second number"+second);
	float temporary=first;
	first=second;
	second=temporary;
	System.out.println("***********************");
	System.out.println("--after swap--");
	System.out.println("first number"+first);
	System.out.println("second number"+second);
}
}
