
public class VariableScopesDemo {
	int i=10;		//instance scope
	static int j=20; //class scope
	public void accept() {
		
		i++;
		j++;
		
	}	
	public  void display() {
		System.out.println(i);
		System.out.println(j);
	}

	public static void main(String[] args) {
			VariableScopesDemo v1 = new VariableScopesDemo();
			v1.accept();
			v1.display();
			VariableScopesDemo v2 = new VariableScopesDemo();
			v2.accept();
			v2.display();
			System.out.println(j);
			System.out.println(v1.j);
			System.out.println(v2.j);
			System.err.println(VariableScopesDemo.j);
	}
}
