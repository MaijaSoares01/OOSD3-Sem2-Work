package lecture06;

public class TestStatic {

	public static void main(String[] args) {
		StaticTest test = new StaticTest();
		test.setInstanceCount();
		test.printInstanceCount();
		test.setCount();
		test.getCount();
		StaticTest test2 = new StaticTest();
		test2.setInstanceCount();
		test2.printInstanceCount();
		test2.setCount();
		test2.getCount();
		StaticTest.setCount();
		StaticTest.getCount();

	}

}
