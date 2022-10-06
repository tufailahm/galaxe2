JDK 1.8
Eclipse IDE



Language Fundamentals, Interfaces, OO Programming with Java

What is java ?


JDK
	JVM
	JRE


JRE
	JVM ??




OOPS

ABSTRACTION	->showing the relevant things
ENCAPSLATION	-> Hiding the irrelavant things
POLYMORPHISM
INHERITANCE


class
object



state
behavior

Code structure in java 
====================

public class Welcome {

	int num=10;
	int age;
	age=86;
	public void accept() {
		System.out.println("Age is :"+age);
	}
	public void display()
	{
		accept();
		System.out.println("Display called");
	}
	public static void main(String[] args) {
		System.out.println("Hello and welcome");
		Welcome w = new Welcome();
		w.display();
		Bye b = new Bye();
		b.hello();
	}
}

class Bye
{
		public void hello() {
			System.out.println("Bye hello called");
		}
		public static void main(String[] args) {
			System.out.println("Bye main caled");
			Welcome w = new Welcome();
			String names[]= {"sdisd","sdssd"};
			w.main(names);
		}
}

variables scopes
===================





































packages
=====================


















access specifiers
========================

public
private
protected
default






































