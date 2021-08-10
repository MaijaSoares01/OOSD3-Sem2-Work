package lecture11;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Practice2 {

	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("test.txt");
			int myData = reader.read();
			while(myData!=-1){
				System.out.print((char)myData);
				myData = reader.read();
			}
			reader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
