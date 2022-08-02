package j15_스태틱;

import lombok.Data;

@Data
public class Student {
	
	public static int autoCode = 2022000;
	
	private int studentCode;
	private String name;
	
	public Student(String name) {
		studentCode = ++autoCode;
		this.name = name;
	}

}
