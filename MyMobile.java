package week1.assignment;

public class MyMobile {
	public void makeCall() {
		System.out.println("call connected");

	}

	public void sendMsg() {
		System.out.println("msg send");

	}

	private void payBills() {
		System.out.println("payment completed");

	}

	public static void main(String[] args) {
		MyMobile mm = new MyMobile();
		mm.makeCall();
		mm.sendMsg();
		mm.payBills();

	}

}
