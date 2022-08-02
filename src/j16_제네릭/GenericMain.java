package j16_제네릭;

public class GenericMain {

	public static void main(String[] args) {
		GenericTest<Integer, String> genericTest = new GenericTest<Integer, String>();
		
		genericTest.setKey(100);
		genericTest.setValue("원");
		
		System.out.println(genericTest.getKey() + genericTest.getValue());

	}

}
