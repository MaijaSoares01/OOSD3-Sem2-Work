package lecture07;

public class ThreadResources {

	public void resourceMethod() {
		long resourceCount = 0;
		resourceCount++;
	}
	
	public void objectResources() {
		LocalObject myObject = new LocalObject();
		myObject.callMethod();
	}
	
	public void methodTest(LocalObject localObject) {
		localObject.setValue("test");
	}
}

class NotThreadSafe{
	StringBuilder builder = new StringBuilder();
	
	public void add(String text){
		this.builder.append(text);
	}
}
//Create 2 threads --> A and B
//NotThreadSafe nts - new NotThreadSafe()
//Both threads A and B use the same nts instance
//Both call add -- cause race condition