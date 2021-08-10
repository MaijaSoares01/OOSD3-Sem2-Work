package lecture11;
import java.io.FileReader;
import java.io.IOException;
public class Practice4 {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("oosd.txt");
			int data = fileReader.read();
			while(data!=-1) {
				System.out.print((char)data);
				data = fileReader.read();
			}
			fileReader.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
