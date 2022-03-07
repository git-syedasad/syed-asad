package day33;

import java.util.Scanner;

//Switch Case With String
public class SwitchCase2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("please enter the String..");
	String 
	str=scan.next();
	switch(str) {
	case "jan":{
		System.out.println("january month..");
		break;
	}
	case "feb":{
		System.out.println("feb month..");
		break;
	}
	default:{
		System.out.println("no month :(");
		
	}
	}
}
}
