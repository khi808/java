package referenceType;

public class MethodEx {
	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		
		myclass.setNum(3);
		System.out.println(myclass.getNum());
		
		
		System.out.println(myclass.getName());
		myclass.setName("Hello");
		System.out.println(myclass.getName());
		
		System.out.println(MyClass.getClassName());
		System.out.println(myclass.getClassName());
		
	}
}
