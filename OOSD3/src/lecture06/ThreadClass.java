package lecture06;

public class ThreadClass extends Thread{

	public static void main(String[] args) {
		ThreadClass threadClass = new ThreadClass();
		threadClass.start();
	}
	
	public void run() {
		System.out.println("My Thread is running");
	}
}
