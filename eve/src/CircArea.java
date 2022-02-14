import java.util.Scanner;
public class CircArea {
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.println("enter the radius");
double radius=reader.nextDouble();
double area=Math.PI*(radius*radius);
	System.out.println("the area of a circle is :"+area);
}
}
