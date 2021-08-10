package lecture10;
import java.io.*;
public class Practice1 {
	public static void main(String[] args) {
		try {
			FileOutputStream fout1 = new FileOutputStream("oosd.txt");
			FileOutputStream fout2 = new FileOutputStream("test.txt");
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			bos.write(65);
			bos.writeTo(fout1);
			bos.writeTo(fout2);
			bos.flush();
			bos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
