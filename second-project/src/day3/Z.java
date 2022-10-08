package day3;

public class Z {
	
	int num=90;
	{
		System.out.println("3. Z instance block");
	}
	static {
		System.out.println("1.static block");
	}

	public Z() {
		System.out.println("6. Z constructor");
	}
	W w = new W();
	public static void main(String st[]) {
		System.out.println("2.In main");
		Z z1 = new Z();
		//System.out.println("Again");
		//new Z();
	}
}
