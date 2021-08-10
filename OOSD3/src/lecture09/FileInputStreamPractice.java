package lecture09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamPractice {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("oosd.txt");
			int i = 0;
//			while((i = fis.read()) != -1) {//this prints out the number correlated to each letter
//				System.out.print(i + "  ");
//			}
			while((i = fis.read()) != -1) {//this prints out the characters
				System.out.print((char)i);
			}
			fis.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
