package lecture10;

import java.io.*;

public class Practice5 {
	public static void main(String[] args) throws IOException {
		File data = new File("oosd.txt");
		FileOutputStream file = new FileOutputStream(data);
		DataOutputStream filter = new DataOutputStream(file);
		String s = "Welcome to OOSD3!";
		byte[] b = s.getBytes();
		filter.write(b);
		filter.flush();
		filter.close();
		file.close();
	}
}
