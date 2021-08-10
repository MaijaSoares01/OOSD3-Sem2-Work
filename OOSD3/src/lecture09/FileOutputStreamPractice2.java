package lecture09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamPractice2 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("oosd.txt");
			String oosd3 = "Welcome to 00SD3!";
			byte[] myByteString = oosd3.getBytes();
			fos.write(myByteString);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
