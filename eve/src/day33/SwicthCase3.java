package day33;

import java.util.Scanner;

//Switch Case with Char
public class SwicthCase3 {
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.println("please enter the char..");
	char ch=reader.next().charAt(0);
	switch(ch) {
	case 'a':{
		System.out.println("char A called.."+ch);
		break;
	}
	case 'b':{
		System.out.println("char B called.."+ch);
	break;
	}
	default:{
		System.out.println("character not found :(");
	}
	}
	}
}
