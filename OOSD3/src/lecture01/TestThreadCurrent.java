package lecture01;

public class TestThreadCurrent extends Thread{
	public void run() {
		
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		TestThreadCurrent thread1 = new TestThreadCurrent();
		TestThreadCurrent thread2 = new TestThreadCurrent();
		thread1.start();
		thread2.start();
	}
}
