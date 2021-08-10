package lecture02;

public class TestDaemonThread extends Thread{

	public void fun() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Deamon thread here");
	} else {
		System.out.println("user thread here");
	}
	}
	public static void main(String[] args) {
		TestDaemonThread thread1 = new TestDaemonThread();
		TestDaemonThread thread2 = new TestDaemonThread();
		TestDaemonThread thread3 = new TestDaemonThread();
		thread2.setDaemon(true);
		thread1.start();
		thread2.start();
		thread3.start();
		//thread2.setDaemon(true); this will cause an error which is why it has to be before .start
	}
}

