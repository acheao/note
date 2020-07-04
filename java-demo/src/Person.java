import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable{
	private int age;
	private String name;
	private String sex;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	
	public Person(int age,String name,String sex){
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Person p = new Person(10,"小红","女");
		ObjectOutputStream out  = new ObjectOutputStream(new FileOutputStream(new File("G:\\p.txt")));
		out.writeObject(p);
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("G:\\p.txt")));
		Person pers = (Person)in.readObject();
		System.out.println(pers.getName());
	}
	

}
