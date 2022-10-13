package day7;

public class Bank {

	public static void main(String[] args) {
		Payment tufail = Payment.getPaymentInstance();
		tufail.deposit(760000, "Tufail");
		Payment yamini =Payment.getPaymentInstance();
		yamini.deposit(546566, "Yamini");
		Payment neha = Payment.getPaymentInstance();
		neha.deposit(87655, "Neha");
	}

}
