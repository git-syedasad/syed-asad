import java.util.Scanner;
public class TrianArea {
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.println("enter the width");
	double width=reader.nextDouble();
	System.out.println("enter the height");
	double height=reader.nextDouble();
	double area=(width*height)/2;
	System.out.println("the area of triangle is "+area);
}
}
