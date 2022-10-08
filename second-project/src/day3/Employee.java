package day3;

public class Employee {

	int num=10;
	{
		System.out.println("3.GOOD MORNING");
	}
	static {
		System.out.println("1.Hi");
	}
	public Employee() {
		this.num=20;
		System.out.println("4.Employee def cons called");
	}
	public void display() {
		System.out.println("Display called");
	}
	public static void main(String[] args) {
		System.out.println("2.MAIN CALLED");
		Employee e = new Employee();
		Employee e1 = new Employee();
		new Employee().display();
		
		e.display();
		
	}
}
