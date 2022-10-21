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








https://drive.google.com/file/d/1256Cl72t_ZtJdpv4GSzsJoFPL2Y4tlTd/view?usp=sharing



		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>5.2.6.Final</version>
		</dependency>

		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.40</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api -->
		<dependency>
			<groupId>javax.xml.bind</groupId>
			<artifactId>jaxb-api</artifactId>
			<version>2.1</version>
		</dependency>


		<dependency>
			<groupId>org.javassist</groupId>
			<artifactId>javassist</artifactId>
			<version>3.25.0-GA</version>
		</dependency>



package com.training.galaxe.config;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.training.galaxe.model.Product;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		Configuration configuration = new Configuration();

//		Hibernate settings equivalent to hibernate.cfg.xml's properties
		Properties settings = new Properties();
		settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		settings.put(Environment.URL, "jdbc:mysql://localhost:3306/galaxe?useSSL=false");
		settings.put(Environment.USER, "root");
		settings.put(Environment.PASS, "root");
		settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");

		// settings.put(Environment.SHOW_SQL, "true");

		settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

		settings.put(Environment.HBM2DDL_AUTO, "create");

		configuration.setProperties(settings);

		// ***
		configuration.addAnnotatedClass(Product.class);

		// required for mysql 8
		
		  ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder() //
		  .applySettings(configuration.getProperties()).build(); // sessionFactory =
		  configuration.buildSessionFactory(serviceRegistry);
		 		 
		 //mySQL5
		sessionFactory = configuration.buildSessionFactory();

		return sessionFactory;

	}
}

===============================
ORM - Hibernate

Data


something.save(product);

Use case : We have to save our product data to database.

Framework
Maven

Step 1: Create Maven Project



DAO 








===============Day 2 Hiberanate

Product App - Complete App
Problems 
Solution
Query
Criteria
Synchronization in Hibernate
Hibernate Inheritance Mapping


HQL
=========
Hibernate query language	- SQL

select * from product;
select * from product where productName = 'Bottle';

select * from product where productName = 'Bottle' and price = "+price



Synchronization in Hibernate
====================
















Spring
==============
is a framework which manages the 

DI 	-= Dependency injection
IOC	- Inversion of control


Payment


	Payment p;		//NULL pointer exceptin


	p.withdraw();


Bean - A Spring bean is an object that is instantiated, created, and managed by the IoC container. Beans are the backbone of an application.

Dependency injection - A programming design pattern that makes code loosely coupled, meaning that any change in the application of one, will not affect the other.

Inversion of control (IoC) - Taking control away from the class and giving it to the Spring Framework.



Spring -
Lot of configurations

Spring Boot
==========
Zero configuration
Embedded tomcat


Spring Core
Spring JPA
Spring Hibernate
Spring AOP
Spring JDBC
Spring MVC
many more


port = 8080

9090

@Component
@Service
@Controller
@RestController
@Repository



Dev Tools in Spring boot - Live Reload (Automatically your app will restart - upon changes)


Bill
Customer
Employee
Orders

getDetails()


--------------
product-app-final1

String Data JPA
Spring Web
Devtools
MySQL




spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/galaxe
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=create

server.port=9090






REST
=================




http://localhost:9090/	- <YOUR NAME>
http://localhost:9090/welcome	- WELCOME TO GALAXE
http://localhost:9090/hi/welcome	- WELCOME TO HI APP


http://192.168.8.8:9090/welcome


Parameters in REST

@PathVariable
@RequestBody


HTTP Methods

GET	- RETRIEVE 
POST	- CREATE/INSERT
PUT	- UPDATE/MODIFY
DELETE	- REMOVE/DELETE


























E:\NewTrainingMaterial\react_mongo_rest\crud-app-react
