package lecture09;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamPractice {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("test.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			int i = 0;
//			while((i = fis.read()) != -1) {//this prints out the number correlated to each letter
//				System.out.print(i + "  ");
//			}
			while((i = bis.read()) != -1) {//this prints out the characters
				System.out.print((char)i);
			}
			bis.close();
			fis.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
