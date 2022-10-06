import finance.Payment;
import finance.Tax;

import finance.*;


public class Welcome {

	int num=10;
	int age=86;
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
		Customer c = new Customer();
		c.payBill();
		Payment p = new Payment();
		p.salary();
	}
}

class Bye
{
	int amount=20;
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


class Pay extends Bye
{
		public void display() {
			hello();
			System.out.println(amount);
			Bye b = new Bye();
			System.out.println(b.amount);
		}
}


class Debt
{
	public void display() {
		Bye b = new Bye();
		System.out.println(b.amount);
	}
	
}




