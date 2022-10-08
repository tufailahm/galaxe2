package day3;

abstract class Animal {
	public Animal() {
		System.out.println("Animal cons called");
	}
	public abstract void eat() ;
	public abstract void breathe() ;

	public void sleep() {
		System.out.println("Animal should sleep");
	}
	public void work() {
		System.out.println("Animal works");
	}
}
abstract class Tiger extends Animal {
	@Override
	public void eat() {
		System.out.println("All tigers will eat meats");
		
	}
	public abstract void roam();
}
class Cat extends Tiger {

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void roam() {
		// TODO Auto-generated method stub
		
	}
	
}
class Dog extends Animal {

	public Dog() {
		System.out.println("Dog cons called");
	}
	@Override
	public void eat() {
		System.out.println("Dog eat meat");
	}
	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		
	}
}
class Men extends Animal{
	
	@Override
	 public void eat() {
		System.out.println("Men eats veg and non-veg");
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		
	}
}
public class ClientInheritance {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		Men m = new Men();
		m.eat();
	}
}

class Food
{
	
}
class Pizza extends Food
{
	
}
class Tacos extends Food
{
	
}