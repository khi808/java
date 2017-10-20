import java.lang.*;

public class OperatorEx {
	public static void main(String[] args) {
		//산술 연산자
		System.out.println(5 + 3);
		System.out.println(5 - 3);
		System.out.println(5 * 3);
		System.out.println(5 / 3);
		System.out.println(5 % 3);
		
		//단항 연산자
		int i = 1;
		i++;
		System.out.println(i);
		i--;
		System.out.println(i);
		
		boolean  b = true;
		System.out.println(b);
		System.out.println(!b);
		
		//관계 연산자
		System.out.println(3 == 3); // 같다 참
		System.out.println(3 != 3); // 다르면 참
		System.out.println(3 > 3); // lv가 크면 참
		System.out.println(3 >= 3); // lv가 크거나 같으면 참
		System.out.println(3 < 3); // rv가 크면 참
		System.out.println(3 <= 3); // rv가 크거나 같으면 참
		
		// 조건 연산자 (논리연산자)
		System.out.println("조건연산자 &&");
		System.out.println(true && true); // 양변이 참이여야 참
		System.out.println(false && false); 
		System.out.println(true && false); // 하나라도 거짓이면 거짓
		System.out.println(false && true);
		
		System.out.println("조건연산자 ||");
		System.out.println(true || true); // 하나만 참이면 참
		System.out.println(false || false); // 거짓 
		System.out.println(true || false); // 참
		System.out.println(false || true); // 참
		
		
		
		
	}
}
