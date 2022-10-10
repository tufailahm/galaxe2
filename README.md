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



https://github.com/tufailahm/galaxe2







Function Calling

Constructors
String
StringBuffer
StringBuilder
Inheritance
Abstract class
Interface
Overloading 




class A
{
	public void display()
	{
		
	}
	public static void main(String args[])
	{
		display();	
	}
}



Constructors
=================
a special method which has the same name as the class name
it does not have any return type not even void
it gets called automatically whenever you create an object
is used to initilize instance variables


this keyword
==========
it refers to the current object


String
==============
class - java .lang package
it is immutable - cannot be changed
array of characters
lots of useful methods

StringBuffer
==================
mutable
















var args
========
JDK1.5 

package day2;

import java.sql.Date;

public class OverloadingDemo {
	
	public void add() {
		System.out.println("add without paramters");
	}
	public void add(int num1,int num2) {
		System.out.println("add with two paramters");

	}
	public void add(int...numbers) {
		int sum=0;
		System.out.println("add with var args paramters");
		for(int i:numbers) {
				sum+=i;
		}
		System.out.println("Sum of all the numbers are :"+sum);
	}
	public void admitPatient(String patientName,String symptoms) {
		System.out.println("admitting pateint with doctor details");
	}
	public void admitPatient(String patientName,String symptoms,String doctorName) {
		
	}
	public static void main(String[] args) {
			System.out.println(98.98);
			System.out.println(true);
			System.out.println("KK");
			
			OverloadingDemo demo = new OverloadingDemo();
			demo.add(12,99,998,887);
			demo.add(12,99,8);

			
	}
}










========================================================

Inheritance


extends


Instance Block
Static block

1.static block
2.In main
3.W Intance block
4.W constructor
5. Z instance block
6. Z constructor
Again
3.W Intance block
4.W constructor
5. Z instance block
6. Z constructor




Inheritance
Abstract class
==================




Interfaces
====================































Interface
	public abstract void demo();
	static final
Object class and it methods
GC
Getters and Setters


Customer
	customerId
	customerName
	customerAddress
	billAmount

Exception Handling

==================

Compile time - syntax
Logical error 

Runtime error	- happens at execution time of your program

why exception handling
===================

1) to not terminate program abrutly
2) to give proper error messages
3) to perform some important/closing operations


try
catch
finally


Exception heirarchy
===============

Throwable



















































































