package lecture04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessBuilderExample {

	public static void main(String[] args) throws IOException, InterruptedException{
	ProcessBuilder pb = new ProcessBuilder("echo", "This is a ProcessBuilder example for today's lesson");
	System.out.println("Calling the start method now");
	Process process = pb.start();
	int errorCode = process.waitFor();
	System.out.println("Print process executed any errors? " + (errorCode == 0 ? "No" : "Yes"));
	System.out.println("Print process output? " + output(process.getInputStream()));
	}
	public static String output(InputStream inputStream) throws IOException{
		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;
//		br = new BufferedReader(new InputStreamReader(inputStream));
//		String line = null;
		try {
			br = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while((line = br.readLine()) != null) {
				sb.append(line + "-");
				}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
		br.close();
		}
		return sb.toString();
	}
}
