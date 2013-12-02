package task2;

public class PaymentTest {

	public static void main(String[] args) {
		Payment payment = new Payment();
		payment.add(payment.new PaymentPart("Cheese"));
		payment.add(payment.new PaymentPart("Bread"));
		payment.add(payment.new PaymentPart("Butter"));
		payment.add(payment.new PaymentPart("Potato"));
		payment.add(payment.new PaymentPart("Cucumber"));
		System.out.println(payment.toString());
	}

}
