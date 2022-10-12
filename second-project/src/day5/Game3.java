package day5;

public class Game3 extends Thread {

	public Game3() {
		
	}
	@Override
	public void run() {
		System.out.println("RUN CALLED: "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		
		Thread.currentThread().setName("GAME-MAIN");
		Game3 g1 = new  Game3();
		g1.setName("SOUND-G1");
		Game3 g2 = new  Game3();
		g2.setName("SCORE-G2");
		
		g1.setPriority(MIN_PRIORITY);
		g2.setPriority(MAX_PRIORITY);
		
		g1.start();
		g2.start();
		System.out.println("MAIN CALLED BY : "+Thread.currentThread().getName());
	}
}
