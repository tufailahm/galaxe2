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



Day 5
=============
Exception Handling
Threads
I/O



throw
-----------
keyword used to bring exception


user defined exception




throws






























Threads
====================
java.lang	- Thread		- extends
java.lang	- Runnable	- implements




Create four threads
	
	FIRST
	SECOND
	THIRD
	FOURTH


	THIRD
	FIRST


Lifecycle of thread
============

#1: 3
#1: 2
#1: 1
#2: 3
#3: 3
#3: 2
#2: 2
#2: 1
#3: 1


Thread safety
Sync


Collection framework
===============
framework which reduces programming efforts.
lots of useful interfaces and classes
easy learning curve


java.util package

<I>				Collection		
<I>	
<I>		List			Set
		accept duplicate values	no duplicate values		

<C>

		ArrayList	(NSync)		HashSet  -(no order is guranteed)
		LinkedList		TreeSet (sorted)
		Vector	(Sync)		LinkedHashSet -(As it is)



Generics


Iterator

used to iterate over a collection

Collections
------------
class
this class has lots of useful static methods like searching,sorting















	List<String> names = new ArrayList<String>();
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");
		
		names.forEach(n -> System.out.println(n));





package lambada;

public class Lambada3 {

	public static void main(String[] args) {
		
		Runnable runnable = () -> System.out.println("RUN CALLED BY :"+Thread.currentThread().getName());
		Thread thread = new Thread(runnable);
		
		thread.start();
		
		System.out.println("MAIN CALLED by :"+Thread.currentThread().getName());

	}
}



interface MathOperation
{
	int operation(int a,int b);
}
public class Lambada4 {

	public static void main(String[] args) {
		
	    //without type declaration
		MathOperation mathOperation = (a,b) -> a+b;
		System.out.println(mathOperation.operation(12, 12));
		
		  //with type declaration
		MathOperation mathOperation2 = (int a,int b) -> a - b;
		System.out.println(mathOperation2.operation(12, 12));
		
		//with return statement along with curly braces
		MathOperation mathOperation3 = (int a,int b) -> { return a * b; };
		System.out.println(mathOperation3.operation(12, 12));






Anonymous classes
Inner classes


_Interface
Comparable	-java.lang	compareTo();

Comparator	- java.util		compare(o1,o2)	- 





Collections - Map




-----------
<I>	Map	- Key/Value
	
	HashMap		- no order
	LinkedHashMap	- as it is 
	TreeMap		-sorted
	

Key cannot be duplicate
	

Java8 New Features
=======================

Lambada expression
streams
new date and time

Functional Interface - which has a single method 

interface


























OO Design Principles & Patterns

IO



SOLID
-------------

Design patterns
==================

Singtelon Design pattern





















