package day2;

class Employee {
	int employeeId;
	String employeeName;
	public Employee() {
		System.out.println("Employee Default constructor");
			employeeId = -1;
			employeeName = "Not Available";
	}
	public Employee(int employeeId, String employeeName) {
		this();
		System.out.println("Employee 2 arg constructor");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	public Employee(int employeeId) {
		this();
		System.out.println("Employee 1 arg constructor - int");
		this.employeeId = employeeId;
	}
	public Employee(String employeeName) {
		this();
		System.out.println("Employee 1 arg constructor - String");
		this.employeeName = employeeName;
	}
	public void display() {
		System.out.println("Employee Id :"+employeeId);
		System.out.println("Employee Name :"+employeeName);
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Employee akshay = new Employee();
		Employee shree = new Employee(129);
		Employee nagendra = new Employee("Nagendra");
		Employee kavya = new Employee(130,"Kavya");
		System.out.println("Akshay details");
		akshay.display();
		System.out.println("Shree details");
		shree.display();
		System.out.println("Nagendra details");
		nagendra.display();
		System.out.println("Kavya details");
		kavya.display();
	}
}
