
public class whileEx {
	public static void main(String[] args) {
		int age = 20;
		while (age > 15) {
			System.out.println("Hi");
			age --;
		}
		
		do {
			System.out.println("Bye");
		} while (age < 15);
		
		while (true) {
			if (age == 10) {
				break;
			}
			System.out.println("Hi3");
			age--;
		}
		
		age = 12;
		while (age > 8) {
			age--;
			if (age == 10) {
				continue;
			}
			System.out.println(age);
		}
		
	}
}
