package lecture01;

public class TestThreadPriority extends Thread{
	public void run() {
		System.out.println("running thread name: " + Thread.currentThread().getName());
		System.out.println("running thread priority: " + Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		TestThreadPriority thread1 = new TestThreadPriority();
		TestThreadPriority thread2 = new TestThreadPriority();
		thread1.setPriority(MIN_PRIORITY);
		thread2.setPriority(MAX_PRIORITY);
		thread1.start();
		thread2.start();
	}

}
