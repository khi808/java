package referenceType;

public class OverloadingEx {
	
	public static void main(String[] args) {
		MyClass2 myObject = new MyClass2();	
		myObject.print("Hi");
		myObject.print(10);
		myObject.print(10, 20);
		myObject.print(10,30,20,15);
		
		System.out.println("정수의 합 : " + myObject.sum(10,30,50,25,33,2));
	}
	
}
