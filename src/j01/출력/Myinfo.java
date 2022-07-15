package j01.출력;

public class Myinfo {

	public static void main(String[] args) {
		char name1 = '송';
		char name2 = '상';
		char name3 = '헌';
		String name = "송상헌";
		
		int age = 30;
		
		String address = "부산 서구 대신동";
		
		System.out.print("이름: ");
        System.out.println("" + name1 + name2 + name3);
        System.out.print("나이: ");
        System.out.println(age);
        System.out.print("주소: ");
        System.out.println(address);
        System.out.println();
        
        System.out.print("이름: ");
        System.out.println(name);
        System.out.print("나이: ");
        System.out.println(age);
        System.out.print("주소: ");
        System.out.println("부산 서구 대신동 ");
        System.out.println();
        
        System.out.print("이름: ");
        System.out.println("송상헌:");
        System.out.print("나이: ");
        System.out.println(age);
        System.out.print("주소: ");
        System.out.println("부산 서구 대신동 ");
        System.out.println();

	}

}
