
public class exam {
	public static void main(String args[]) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("# # # # #");	
		}
		
		System.out.println();
		
		for (int i = 1; i <= 7; i++) {
			if (i % 2  == 0) {
				System.out.println(" # # # # # # #");
				continue;
			}
			System.out.println("# # # # # # #");
		}
		System.out.println();
		
		for (int i = 0; i<8; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < 8; i++) {
			for (int j = 8; j > i; j--) {
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < 8; i++) {
			for (int n =1; n < i+1; n++) {
				System.out.print("   ");
			}
			for (int j = 8; j > i; j--) {
				System.out.print(" #");
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i = 0; i < 8; i++) {
			for (int n =8; n > i+1; n--) {
				System.out.print("   ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print(" #");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
	}
}
