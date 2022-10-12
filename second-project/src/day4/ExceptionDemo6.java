package day4;

import java.io.FileReader;

public class ExceptionDemo6 {

	int num1,num2,result;
	String name;
	public void display() {
		System.out.println("Hi ");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		System.out.println("Welcome ");
		ExceptionDemo6 demo1 = new ExceptionDemo6();
		demo1.display();
		System.out.println("Thanks for using my program");
	}
}
