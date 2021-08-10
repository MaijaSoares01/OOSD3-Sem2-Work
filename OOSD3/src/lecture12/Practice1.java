//run Practice 1 then 2 
package lecture12;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Practice1 {

	public static void main(String[] args) {
		try {
			Student myStudent = new Student (234567,"Joe Murphy", 21);
			FileOutputStream fos = new FileOutputStream("MyFile.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(myStudent);
			oos.flush();
			oos.close();
			System.out.println("Completed");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

class Student implements Serializable{
	int studentId;
	String name;
	transient int age;//avoid serialization it wont be saved
	public Student(int studentId, String name, int age) {
		this.studentId = studentId;
		this.name = name;
		this.age = age;
	}
}
