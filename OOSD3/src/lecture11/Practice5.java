package lecture11;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Practice5 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("test.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("We are in week 11.");
			bw.newLine();
			bw.write("The lessons are nearing completion.");
			bw.close();
			System.out.print("Task Complete");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
