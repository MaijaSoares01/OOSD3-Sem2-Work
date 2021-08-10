package lecture01;

public class TestThreadTwice extends Thread {
	public void run() {
		System.out.println("running....");
	}
	
	public static void main (String[] args) {
		TestThreadTwice thread = new TestThreadTwice();
		thread.start();
		thread.start();
	}

}
