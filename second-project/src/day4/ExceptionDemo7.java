package day4;

import java.io.FileReader;

public class ExceptionDemo7 {

	int num1, num2, result;
	String name;

	public void display() {
		System.out.println("Hi ");
		int marks[] = new int[10];
		System.out.println(marks[12])
		;
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		System.out.println("Welcome ");
		ExceptionDemo7 demo1 = new ExceptionDemo7();
		demo1.display();
		System.out.println("Thanks for using my program");
	}
}
