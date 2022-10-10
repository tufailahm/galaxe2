package day4;

import java.util.Scanner;

public class ExceptionDemo3 {

	int num1,num2,result;
	int marks[] = new int[5];
	Scanner scanner = new Scanner(System.in);
	String name;
	public void display() {
		System.out.println("Hi ");
		
		try {
		//	int num[] = new int[-9];
			System.out.println(marks[10]);
			System.out.println("Your name length  is :"+name.length());
		} 
		catch (NullPointerException e) {
			System.out.println("Cannot access null objects");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Cannot access an array beyond its limits");
		}
		catch(Exception e) {
			System.out.println("Some other error happened");
		}
		finally {
			//some closing
			System.out.println("FINALLY CALLED");
		}
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		System.out.println("Welcome ");
		ExceptionDemo3 demo1 = new ExceptionDemo3();
		demo1.display();
		
		System.out.println("Thanks for using my program");
	}
}
