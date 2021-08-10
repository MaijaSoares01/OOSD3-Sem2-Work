package lecture04;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class processSimpleExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("/Application/Firefox.app");
		p.waitFor(10, TimeUnit.SECONDS);
		p.destroy();
		//p.destroyForcibly();
	}
}
