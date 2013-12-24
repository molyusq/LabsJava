
public class Client {
	private String fName;
	private String lName;
	private int age;
	private Account account;
	private CreditCard card;
	
	public Client(String fName, String lName, int age) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}
	
	public void setFirstName(String fName) {
		this.fName = fName;
	}
	public String getFirstName() {
		return fName;
	}
	
	public void setLastName(String lName) {
		this.lName = lName;
	}
	public String getLastName() {
		return lName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public boolean sendToAnotherAccount(int amount, Account another) {
		if(account.getAmount() > amount) {
			another.setAmount(another.getAmount() + amount);
			return true;
		}
		else return false;
	}
	
	public boolean blockCard() {
		if(card.getStatus()) {
			card.changeStatus();
			return true;
		}
		return false;
	}
	
	public boolean nullifyAccount() {
		if(account.getAmount() > 0) {
			account.setAmount(0);
			return true;
		}
		return false;
	}
	
	public int hashcode() {
		final int coef = 11;
		return age * coef;
	}
	
	public String toString() {
		return getClass().getName() + "[fName=" + fName + ", lName=" + lName + ", age=" + age + ", account=" + account + ", card=" + card.toString();
	}
	
	public boolean equals(Object object) {
		if(object == this)
			return true;
		if(object != null || object instanceof Client) {
			Client another = (Client) object;
			return fName.equals(another) && lName.equals(another) && age == another.age && account.equals(another.account) && card.equals(another.card);
		}
		return false;
	}
}
