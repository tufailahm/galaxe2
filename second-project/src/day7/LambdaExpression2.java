package day7;
@FunctionalInterface
interface MathOperation {
	int operation(int a, int b);
}

public class LambdaExpression2 {

	public static void main(String[] args) {
		MathOperation m = (a,b) -> a+b;
		System.out.println(m.operation(6, 6));
		
		Runnable r = () -> System.out.println("Hello :"+Thread.currentThread().getName());
		Thread t1 = new Thread(r);
		t1.start();
		
	}

}
