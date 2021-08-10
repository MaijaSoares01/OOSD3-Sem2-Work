package lecture09;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamPractice1 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("test.txt");
			fos.write(65);
			fos.close();
		}catch(IOException e) {
			System.out.print(e);
		}
	}
}
