package lecture02;
//shows the difference between runnable and Thread and how they can achieve the same thing 
public class TestMultitask extends Thread{//comment this out
//	public class TestMultitask implements Runnable{
	public static void main(String[] args) {
		//Thread t1 = new Thread(TestMultitask());
		//Thread t2 = new Thread(TestMultitask());
		//Thread t3 = new Thread(TestMultitask());
		TestMultitask t1 = new TestMultitask();//comment this out
		TestMultitask t2 = new TestMultitask();//comment this out
		TestMultitask t3 = new TestMultitask();//comment this out
		t1.start();
		t2.start();
		t3.start();
	}
	@Override
	public void run() {
		System.out.println("Task one");
	}
}
