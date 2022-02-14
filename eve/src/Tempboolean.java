
public class Tempboolean {
public static void main(String args[])
{
	boolean b=true;
	System.out.println("b is "+b);
	b=false;
	System.out.println("b is "+b);
	if(b) System.out.println("THIS IS EXECUTED");
	b=false;
	if(b) System.out.println("THIS IS NOT EXECUTED");
	System.out.println("IF 10>9 THEN IT IS "+(10>9));
}
}
