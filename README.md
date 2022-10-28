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

=============================
Spring Boot
	JPA keywords
	Lombok
	AOP
	Actuator


Use case : We want to search by product name

http://localhost:9090/product/searchByProductName/Lakme

Keywords

	public List<Product> findByProductName(String productName);
	public List<Product> findByPrice(int price);		



http://localhost:9090/product/searchByProductPriceRange/100/200





https://teams.microsoft.com/l/meetup-join/19:918f1078f6134f4cbab54661753b4590@thread.tacv2/1666672206903?context=%7B%22Tid%22:%22f05cf28c-208e-4f41-bb7d-64141a37a2f9%22,%22Oid%22:%2239a8210a-3bb7-4b75-a78d-a941b948b148%22%7D








Lombok
==========

Reduces the boilerplate code of pojo class







AOP
========

package com.ust.pms.aspects;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProductServiceAspect {

	private static final Logger log = LoggerFactory.getLogger(ProductServiceAspect.class);

	@Before(value =  "execution(* com.ust.pms.service.ProductService.*(..))")
	public void beforeAdvice(JoinPoint joinpoint)
	{
			System.out.println("##########Before Advice aspect called :: ");
	}
	
	@After(value =  "execution(* com.ust.pms.service.ProductService.*(..))")
	public void afterAdvice(JoinPoint joinpoint)
	{
		Signature methods = joinpoint.getSignature();
		
		log.info(methods.getName() + " , method execution 1 completed successfully at :"+new Date());
			System.out.println("##########After Advice aspect called :: ");
	}
	
	@Around(value =  "execution(* com.ust.pms.service.ProductService.*(..))")
	public Object around(ProceedingJoinPoint joinpoint) throws Throwable
	{
		Signature methods = joinpoint.getSignature();
		
		log.info(methods.getName() + " , method execution AROUND (BEFORE) successfully at :"+new Date());
			System.out.println("##########UST GLOBAL AROUND  :: ");
			
		Object retval = joinpoint.proceed();
		
		log.info(methods.getName() + " , method execution AROUND (AFTER) successfully at :"+new Date());
		System.out.println("##########UST GLOBAL AROUND  :: ");
		
		return retval;
	}
	
}






------

@EnableAspectJAutoProxy(proxyTargetClass = true)


-------

AOP
=========
Aspect Oriented Programming

Use case : Cross cutting concerns

Aspect 

Logging
security
transaction

Pointcut expressions

*Product
*.com.service

@Before		- called before the method
@After		- called after the method
@Around		- called before and after the method
@Throws		-Exception

Use case : We want to do logging for every method of service class (ProductServiceImpl)

























actuator,lombok,rest respository





package com.training;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String reviewName;
    private String reviewByEmail;
    private int rating;

    // standard getters and setters
}


------------

package com.training;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "reviews", path = "reviews")
public interface ReviewsRepository extends PagingAndSortingRepository<Reviews, Long> {
    List<Reviews> findByReviewName(@Param("reviewName") String reviewName);
}

--------------------

server.port=9090

spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/galaxe
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update


-------------------


application.properties
management.endpoints.web.exposure.include=*

Run and check (Postman)
http://localhost:8080/actuator/beans


--------------------
dev tools, open feign, lombok, spring web
Feign Client


package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@Autowired
	private ProductClient productClient;

	@GetMapping("/productData/{id}")
	public Product getData(@PathVariable int id) {
		return productClient.getProductData(id);
	}
}
package com.training;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-client", url = "http://localhost:9090")
public interface ProductClient {
    @GetMapping("/product/{productId}")
    Product getProductData(@PathVariable int productId);
}
package com.training;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ADemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(ADemo2Application.class, args);
	}

}


=======================================================================
Day 14
AOP


Around

Microservices vs Monolithic
Spring Data Rest
Actuator
Communication between two microservices application





Microservices vs Monolithic
======================

amazon
	product	http://localhost:9090/product
	cart
	orders
	payment
	offers
	prime
	reviews	http://localhost:9091/reviews

http://localhost:9091/reviews	- GET
http://localhost:9091/reviews/101	- GET
http://localhost:9091/reviews	- POST
http://localhost:9091/reviews	- PUT
http://localhost:9091/reviews/101	- DELETE


New : Spring Data Rest 


Actuator
=============
Spring 

Use case : I want to see how many beans are there using actuator











Spring Security
==============

Authentication
Authorization


Inbuilt -Login Form based login Security
Custom login form

@Bean

UserDetailsService




User Case : Custom Login Form and also we need to implement authorization and authentication using spring security

Spring MVC - Model View Controller

RESTCONTROLLER	-->JSON	-->  Another Application
CONTROLLER	--> HTML	--> User




Step 1: Create spring starter project - web,security,lombok,devtools

Step 2: Update pom.xml

<dependency>
			<groupId>javax.servlet.jsp.jstl</groupId>
			<artifactId>javax.servlet.jsp.jstl-api</artifactId>
			<version>1.2.1</version>
		</dependency>

		<dependency>
			<groupId>taglibs</groupId>
			<artifactId>standard</artifactId>
			<version>1.1.2</version>
		</dependency>

		<!-- Tomcat for JSP rendering -->
		<dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
			<scope>provided</scope>
		</dependency>

Step 3 : Update application.properties

spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp

Step 4:
** Right click on your project
Create the above folder /src/main/webapp/WEB-INF/views/


Step5: Create HomeController and LoginController

package com.training.pms.galaxe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/hello")					//localhost:9094/hello
	public String hello() {
		return "Hello and welcome to my APP";
	}
	
}


---------
package com.training.pms.galaxe.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)			//localhost:9094/login
	public String login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("errorMsg", "Your username and password are invalid.");

		if (logout != null)
			model.addAttribute("msg", "You have been logged out successfully.");

		return "login";					//  /WEB-INF/views/login.jsp
	}
	
	@RequestMapping(value = "/ahmed", method = RequestMethod.GET)			//localhost:9094/login
	public String ahmed() {
		return "galaxe";					//  /WEB-INF/views/galaxe.jsp
	}

}

Step 6 : Create jsp pages





		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>


File I/O
=========
