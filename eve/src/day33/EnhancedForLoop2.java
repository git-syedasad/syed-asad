package day33;
//Two dimensional array 
public class EnhancedForLoop2 {
public static void main(String[] args) {
	int arr[][]={{10,20,30,40},
			{100,200,300,400},
			{1000,2000,3000,4000}
	};
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("_________________________________");
	System.out.println("enhanced for loop");
	System.out.println("---------------------------------");

	//enhanced for loop
	for(int i[]:arr) {
		for(int j:i) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
