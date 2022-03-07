package day33;

import java.util.Scanner;

//If Else If Demo
public class IfElseIfDemo {
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	System.out.println("please enter the number");
	int i=reader.nextInt();
	if(i==10) {
		System.out.println("the value enterd is 10");
	}
	else if(i==20) {
		System.out.println("the value entered is 20");
	}
	else if(i==30) {
		System.out.println("the value entered is 30");
	}
	else {
		System.out.println("not entered any of the above");
	}
	System.out.println("please enter another value");
	int j=reader.nextInt();
	if(i>=10 && j<=20) {
		System.out.println("the value enterd is between 10 and 20");
	}
	else if(i>=20 && j<=40) {
		System.out.println("the value entered is between 20 and 40");
	}
	else {
		System.out.println("none of the conditions satisfied.......");
			}
		}
	}
