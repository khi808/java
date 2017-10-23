package referenceType;

public class MyClass {
	private int num;
	private String name;
	
	/*  method 정의 방법
	 * 접근 지정자 리턴타입 메소드명 (파라미터타입과 이름) {
	 * 		.... 중괄호 안에 실행될 코드들 ....
	 * 		return 타입에 맞는 값 ; // void 타입이면 생략가능.
	 * 
	 * }
	 * */
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public String setName(String name) {
		return this.name = name;
	}
	
	public String getName() {
		return  this.name;
	}
	
	public static String getClassName() {
		return "이 클래스 이름은 MyClass입니다. ";
	}
	
	
}


