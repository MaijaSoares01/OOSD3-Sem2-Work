package lecture11;
import java.io.FileWriter;
import java.io.IOException;
public class Practice3 {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("oosd.txt");
			fileWriter.write("It is almost the summer!");
			fileWriter.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Task Completed");
	}
}
