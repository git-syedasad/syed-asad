package day33;

import java.util.Scanner;

//Switch case with int
public class SwitchCase {
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.println("please enter the number...");
	int num=reader.nextInt();
	switch(num) {
	default:{
		System.out.println("default called.."+num);
		break;
	}
	case 1:{
		System.out.println("case 1 called.."+num);
		break;
	}
	case 2:{
		System.out.println("case 2 called.."+num);
		break;
	}
	case 3:{
		System.out.println("case 3 called.."+num);
		break;
	}
	}
}
}
