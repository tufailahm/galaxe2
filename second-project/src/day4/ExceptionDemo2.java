package day4;

import java.util.Scanner;

public class ExceptionDemo2 {

	int num1,num2,result;
	int marks[] = new int[5];
	Scanner scanner = new Scanner(System.in);
	public void display() {
		System.out.println("Hi ");
		
		try {
			System.out.println("Your marks is :"+marks[10]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		System.out.println("Welcome ");
		ExceptionDemo2 demo1 = new ExceptionDemo2();
		demo1.display();
		
		System.out.println("Thanks for using my program");
	}
}
