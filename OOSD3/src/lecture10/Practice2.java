package lecture10;

import java.io.ByteArrayInputStream;

public class Practice2 {
	public static void main(String[] args) {
		byte[] buffer = {65, 75, 35, 36};
		ByteArrayInputStream bis = new ByteArrayInputStream(buffer);
		int i = 0;
		while((i = bis.read()) != -1){
			char ch =(char)i;
			System.out.println("i: " + i + ", ch: " + ch);
		}
	}
}
