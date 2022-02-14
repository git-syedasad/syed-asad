import java.util.Scanner;
public class RectArea {
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.println("please enter the length of rectangle :");
	double length=reader.nextDouble();
	System.out.println("please enter the width of rectangle :");
	double width=reader.nextDouble();
	double area=length*width;
	System.out.println("the area of rectangle is "+area);
}
}
