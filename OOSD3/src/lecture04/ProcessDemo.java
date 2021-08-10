package lecture04;

public class ProcessDemo {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println("Number of Processors: " + r.availableProcessors());
		System.out.println("Total memory: " + r.totalMemory());
		System.out.println("Free memory: " + r.freeMemory());
		System.out.println("Used memory: " + (r.freeMemory()-r.freeMemory()));
	
		for(int i = 0; i<=10000; i++) {
			new Object();
		}
		r.gc();
		
		System.out.println("Memory Status");
		System.out.println("Total memory: " + r.totalMemory());
		System.out.println("Free memory: " + r.freeMemory());
		System.out.println("Used memory: " + (r.freeMemory()-r.freeMemory()));
	}

}
