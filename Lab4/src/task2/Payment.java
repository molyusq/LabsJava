package task2;

import java.util.ArrayList;

public class Payment {
	
	private ArrayList<PaymentPart> paymentList = new ArrayList<PaymentPart>();
	
	public void add (PaymentPart part) {
		paymentList.add(part);
	}
	
	public String toString() {
		return getClass().getName() + "[paymentList=" + paymentList.toString() + "]";
	}
	
	public boolean equals(Object object) {
		if(object == this) 
			return true;
		if(object != null && object instanceof Payment) {
			Payment another = (Payment) object;
			return paymentList.equals(another.paymentList);
		}
		return false;
	}
	
	class PaymentPart {
		private String paymentName;
		
		public PaymentPart(String paymentName) {
			this.paymentName = paymentName;
		}
		
		public String getPaymentName() {
			return paymentName;
		}
		
		public boolean equals(Object object) {
			if(this == object)
				return true;
			if(object != null && object instanceof PaymentPart) {
				PaymentPart another = (PaymentPart) object;
				return paymentName.equals(another.paymentName);
			}
			return false;
		}
		
		public String toString() {
			return getClass().getName() + " [paymentName=" + paymentName + "]";
		}
	}
	
}
