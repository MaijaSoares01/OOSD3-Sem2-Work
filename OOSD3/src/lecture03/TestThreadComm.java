package lecture03;

public class TestThreadComm {
	public static void main(String[] args) {
		Customer customer = new Customer();
		new Thread() {
			public void run() {
				customer.withdraw(15000);
			}
			}.start();
		new Thread() {
			public void run() {
				customer.deposit(10000);
			}
			}.start();
	}
}

class Customer{
	int amount = 10000;
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw....");
		if(this.amount < amount) {
			System.out.println("insufficient balance, waiting for a deposit");
			try {wait();}catch(Exception e) {}
		}
		this.amount -= amount;
		System.out.println("Withdraw complete");
	}
	synchronized void deposit(int amount) {
		System.out.println("going to deposit....");
		this.amount+=amount;
		System.out.println("Deposit complete");
		notify();
	}
}
