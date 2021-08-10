package lecture12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
public class Practice2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("MyFile.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object myObject = ois.readObject();
			if(myObject instanceof Student){
				Student retrievedStudent = (Student) myObject;
				System.out.println("StudentId: " + retrievedStudent.studentId + ", Student Name: " + retrievedStudent.name + ", Student Age: " + retrievedStudent.age);
			}
			ois.close();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}


