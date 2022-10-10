package day4;

class Orders
{
		@Override
		protected void finalize() throws Throwable {
			System.out.println("Orders class - Finalize called - Garbage Collected");
		}
}
public class GCDemo {

	public static void main(String[] args) {
		System.out.println("Main called");
		Orders o1 = new Orders();
		Orders o2 = new Orders();
		Orders o3 = new Orders();
		Orders o4 =new Orders();
		o4 = null;
		o2 = null;
		
		System.gc();
	}
}
