package lecture02;

public class ShutdownExample extends Thread{

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new ShutdownExample());
		
		System.out.println("Main sleeping - press ctrl+c to exist");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			
		}
	}
	
	@Override
	public void run() {
		System.out.println("Shutdown hook task Completed");
	}
}
