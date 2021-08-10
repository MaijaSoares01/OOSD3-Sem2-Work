package lecture06;

public class ThreadRunnable implements Runnable{

	public static void main(String[] args) {
		ThreadRunnable runnable = new ThreadRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("My Runnable Thread is running");
	}
}
