package day4;

import java.io.FileReader;

public class ExceptionDemo5 {

	int num1,num2,result;
	String name;
	public void display() {
		System.out.println("Hi ");
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		System.out.println("Welcome ");
		ExceptionDemo5 demo1 = new ExceptionDemo5();
		demo1.display();
		System.out.println("Thanks for using my program");
	}
}
