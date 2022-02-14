import java.util.Scanner;
public class SqrArea {
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.println("please enter the side of square");
	double side=reader.nextDouble();
	double area=side*side;
	System.out.println("the area of square is :"+area);
}
}
