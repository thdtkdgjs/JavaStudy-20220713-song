package j09_클래스.생성자;

public class ConstuctorEx {
	
	String name;
	int age;
	
	// Args -> Arguments(인수, 매개변수)
	// NoArgsConstructor
	public ConstuctorEx() {
		System.out.println("기본 생성자");
	}
	
	// Required(필수)
	// RequiredArgsConstrustor
	public ConstuctorEx(String name) {
		System.out.println("매개변수: " + name);
		System.out.println("name을 매개변수로 받는 생성자");
		this.name = name;
		
	}
	
	// Required(필수)
	// RequiredArgsConstrustor
	public ConstuctorEx(int age) {
		System.out.println("매개변수: " + age);
		System.out.println("age을 매개변수로 받는 생성자");
	}
	
	// AllArgsConstrustor
	public ConstuctorEx(String name, int age) {
		System.out.println("매개변수: " + name);
		System.out.println("매개변수: " + age);
		System.out.println("전체 생성자");
	}
	
}
