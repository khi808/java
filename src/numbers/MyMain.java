package numbers;

public class MyMain {
	public static void main(String[] args) {
		// 기본 데이터 타입에 관련된 클래스 타입이 있다.
		// 클래스 타입의 속성과 메소드를 사용하기 위해 존재한다.
		// 문자열과 숫자 변환에 자주 사용된다.
		// AutoBoxing, unBoxing 으로 기본 데이터 타입과 클래스타입이
		// 자동 형변환된다.
		
		
		// 정수형 데이터 타입
		int i = 3;
		short s =1;
		long l = 2345L;
		byte b = 12;
		
		// 실수형 데이터 타입
		float f =3.12F;
		double d = 3.42554;
		
		// 참조 데이터 타입 (객체 instance)
		Integer ic = new Integer(3);
		Short sc = new Short((short) 1);
		Long lc = new Long(2341424);
		Byte bc = new Byte((byte) 12);
		
		Float fc = new Float(3.14F);
		Double dc = new Double(3.424153);
		
		System.out.println(ic.toString());
		
		print(3); // AutoBoxing
		
		
	}
	
	public static void print(Integer i) {
		System.out.println(i + 10); // unBoxsing 
	}
}
