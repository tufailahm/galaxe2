package day2;

public class Demo extends Object{
	
	public void add() {
		
	}
	public void add(int num1,int num2) {
		
	}
	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		String name1 = "Neha";
		name1="Ahmed";
		String name2 = new String( "Neha");
		
		System.out.println(name1==name2);		//true
		System.out.println(name1.equals(name2));		//true

		//mutable	- Thread safe
		StringBuffer sb1 = new  StringBuffer("Hello");
		sb1.append(" galaxe");
		
		System.out.println(sb1);
		
		//JDK1.5 - Not thread safe 
		StringBuilder sb2 = new StringBuilder("Bye");
	}
}
