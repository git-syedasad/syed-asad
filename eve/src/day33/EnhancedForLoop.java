package day33;
//one dimensional array
public class EnhancedForLoop {
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50};
	int length=arr.length;
	for(int i=0;i<length;i++) {
		System.out.println(arr[i]+"\t");
	}
	System.out.println("\n__________________________________");
	//enhanced for loop
	for(int i:arr) {
		System.out.println(i+"\t");
	}
	System.out.println("\n____________________________________");
	String str[]=new String[5];
	for(int i=0;i<str.length;i++) {
		System.out.println(i+") hello");
	}
	//enhanced for loop
	for(String i:str) {
		System.out.println(i+"\t");
	}
}
}
