package lecture01;

public class Multithreading extends Thread{
	public void run() {
		System.out.println("Running");
	}
	public static void main(String[] args) {
		Multithreading multithreading = new Multithreading();
		multithreading.start();
	}
}
