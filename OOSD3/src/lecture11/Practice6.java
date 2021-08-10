package lecture11;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Practice6 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("test.txt");
			BufferedReader br = new BufferedReader(fr);
			String content = br.readLine();
			while(content != null){
				System.out.println(content);
				content = br.readLine();
			}
			br.close();
			fr.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
