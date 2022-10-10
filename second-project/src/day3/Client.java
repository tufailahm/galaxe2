package day3;

abstract class Vehicle
{
	int price=1000;
	public abstract void start();
	public abstract void stop() ;
}
interface MusicPlayer 
{
	void play();
	int noOfSongs=100;
}
interface Radio{
	void scan();
	int frequency=93;
}

class Car extends Vehicle implements MusicPlayer,Radio{
	String acType;
	int price=3000;
	public void startAC() {
		System.out.println("Car AC Started");
	}
	//overriding
	public void start() {
		System.out.println("Car Started");
	}
	public void printCarDetails() {
		int price=200000;
		System.out.println("The price of the car is :"+this.price);
	}
	@Override
	public void scan() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stop() {
		System.out.println("Car Stopped");

		
	}
}
class Bike extends Vehicle implements Radio
{

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		System.out.println("Bike Started");
	}

	@Override
	public void stop() {
		System.out.println("Bike Stopped");

		
	}
	
}
public class Client {

	public static void main(String[] args) {		
			Car c = new Car();
			c.start();
			c.stop();
			
		
			Bike b = new  Bike();
			b.start();
			b.stop();
			
			//another way
			System.out.println("==========Another way");
			Vehicle v = new Car();
			v.start();
			v.stop();
			v = new Bike();
			v.start();
			v.stop();
			
			c= null;
			
	}
}
