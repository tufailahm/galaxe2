package day2;

class Vehicle
{
	int price=1000;
	public void start() {
		System.out.println("Vehicle Started");
	}
	public void stop() {
		System.out.println("Vehicle Stopped");

	}
}
class Car extends Vehicle {
	String acType;
	int price=3000;
	public void startAC() {
		System.out.println("Car AC Started");

	}
	public void printCarDetails() {
		int price=200000;
		System.out.println("The price of the car is :"+this.price);
	}
}
public class Client {

	public static void main(String[] args) {
		
			Car c = new Car();
			c.start();
			c.stop();
			c.startAC();
			c.printCarDetails();
	}

}
