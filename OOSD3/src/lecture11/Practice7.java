package lecture11;
import java.io.File;
import java.io.IOException;

public class Practice7 {

	public static void main(String[] args) {
		try {
			File file = new File("practice7.txt");
			if(file.createNewFile()){
				System.out.println("File has been created.");
			}else{
				System.out.println("File already exists.");
			}
			File dir = new File("src");
			String filenames[] = dir.list();
			for(String fileName : filenames){
				System.out.println(fileName);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
