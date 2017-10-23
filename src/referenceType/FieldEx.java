package referenceType;

public class FieldEx {
	int i = 3; // primitive data 초기화를 안하면 는 0 또는 false 갖고
	float f = 3.0F;
	String str = "필드"; // 참조형 데이터는 초기화를 안하면 null 을 갖게 됨
	
	// static variable (class variable)
	public static int num = 10;
	
	public static void main(String[] args) {
		FieldEx fieldEx = new FieldEx();
		System.out.println(fieldEx.str);
		System.out.println(fieldEx.f);
		System.out.println(fieldEx.i);
		
		System.out.println("-------------");
		
		FieldEx fieldEx2 = new FieldEx();
		System.out.println(fieldEx2.str);
		System.out.println(fieldEx2.f);
		System.out.println(fieldEx2.i);
		
		fieldEx2.i = 5;
		
		System.out.println(fieldEx.i);
		System.out.println(fieldEx2.i);
		
		fieldEx.num = 20;
		
		System.out.println(fieldEx.num);
		System.out.println(fieldEx2.num);
		
		
	}
}
