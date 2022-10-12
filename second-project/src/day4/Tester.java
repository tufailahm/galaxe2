package day4;

public class Tester {
	static int m(int i) {
		System.out.println("APPLE");

		i++;
		int num = 1 / 0;
		System.out.println("BALL");

		return i;
	}

	public static void main(String[] args) {
		System.out.println(m(0));
		System.out.println("Thanks for using my program");
	}
}
