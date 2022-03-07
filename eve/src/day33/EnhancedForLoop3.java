package day33;
//uneven Two Dimensional Array
public class EnhancedForLoop3 {
public static void main(String[] args) {
	int arr[][]={{10,20,30,40},
			{100,200,300},
			{1000,2000}};
	int arr2[][]=new int[3][];
	arr2[0]=new int[4];
	arr2[1]=new int[3];
	arr2[2]=new int[2];
	for(int i[]:arr) {
		for(int j:i) {
			System.out.print(j+"\t");
		}
		System.out.println();
	}
	}
}
