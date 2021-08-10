package lecture09;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamPractice {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("test.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			String s = "Welcome to Java I/O";
			byte[] myString = s.getBytes();
			bos.write(myString);
			bos.flush();
			bos.close();
			fos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
