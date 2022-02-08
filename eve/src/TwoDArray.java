
public class TwoDArray {
public static void main(String args[])
{
	int twoD[][]=new int[4][5];
	int row,column,element=0;
	for(row=0;row<4;row++)
		for(column=0;column<5;column++)
		{
			twoD[row][column]=element;
			element++;

		}
	for(row=0;row<4;row++) {
		for(column=0;column<5;column++) 
			System.out.print(twoD[row][column] + " ");
System.out.println();
	}
}
}
