package day7;


class Calculation implements MathOperation {

	@Override
	public int operation(int a, int b) {
		return a + b;
	}

}

public class LambdaExpression1 {

	public static void main(String[] args) {

		Calculation calculation = new Calculation();
		System.out.println(calculation.operation(12, 12));

		// 2nd Way -- Anonymous inner classes
		MathOperation m = new MathOperation() {

			@Override
			public int operation(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};

		System.out.println(m.operation(9, 6));
	}

}
