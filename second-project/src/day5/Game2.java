package day5;

public class Game2 implements Runnable {

	Thread t1;
	public Game2() {
		t1 = new Thread(this);
		System.out.println("1.GALAXE SOLUTIONS");
		t1.start();
		System.out.println("2.?THREAD STARTED :"+Thread.currentThread().getName());
	}
	@Override
	public void run() {
		System.out.println("4.?RUN CALLED: "+Thread.currentThread().getName());
		for(int i=1;i<=5;i++) {
			System.out.println("5.MOHAMMAD TUFAIL AHMED");
		}
	}
	public static void main(String[] args) {
		
		Game2 g = new  Game2();
		System.out.println("3.?MAIN CALLED BY : "+Thread.currentThread().getName());
	}
}
