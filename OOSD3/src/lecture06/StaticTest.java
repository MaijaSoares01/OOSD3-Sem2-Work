package lecture06;

public class StaticTest {
	public static int counter=0;
	public int instanceCount=0;
	
		public static void getCount() {
			System.out.println("Counter: " + counter);
		}
		
		public static void setCount() {
			counter++;
		}
		
		public void printInstanceCount() {
			System.out.println("instanceCount: " + instanceCount);
		}
		
		public void setInstanceCount() {
			instanceCount++;
		}
}


