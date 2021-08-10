package lecture02;

public class MultithreadedMultitask {

	public static void main(String[] args) {
		Task1 task1 = new Task1();
		Task2 task2 = new Task2();
		task1.start();
		task2.start();
	}
	
}
class Task1 extends Thread{
public void run() {
	System.out.println("Task one");
}
}

class Task2 extends Thread{
public void run() {
	System.out.println("Task two");
}
}