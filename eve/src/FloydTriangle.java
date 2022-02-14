import java.util.Scanner;
public class FloydTriangle {
public static void main(String[] args) {
	int rows,columns,numbers=0,j;
	Scanner reader=new Scanner(System.in);
	System.out.println("please enter the number of rows");
	rows=reader.nextInt();
	for(columns=1;columns<=rows;columns++) {
		for(j=1;j<=columns;j++) {
			System.out.print(numbers+" ");
			numbers++;
		}
		System.out.println();
	}
}
}
