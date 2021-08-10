package lecture10;
import java.io.*;

public class Practice3 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("test.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(65);
		dos.writeInt(100);
		dos.writeBytes("Hello");
		dos.flush();
		dos.close();
	}
}
