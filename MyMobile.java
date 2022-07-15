package assignment;

public class MyMobile {

	String mobname = "Samsung";
	char model = 'F';

	public void makeCall() {
		System.out.println("Call my friend");

	}

	public void sendMsg() {
		System.out.println("Welcome on board");

	}

	private void payBills() {
		System.out.println("Pay June month bill");

	}

	public static void main(String[] args) {
		MyMobile mobile = new MyMobile();
		System.out.println(mobile.mobname);
		System.out.println(mobile.model);
		mobile.makeCall();
		mobile.sendMsg();
		mobile.payBills();

	}

}
