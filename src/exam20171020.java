
public class exam20171020 {
	public static void main(String[] args) {
		
		// 1
		for (int i=0; i<5; i++) {
			for (int j=0; j<9; j++) {
				if (j % 2 == 0) {
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		// 2
		for (int i=0; i<7; i++) {
			for (int j = 0; j < 14; j++) {
				if (j % 2 == 0) {
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			System.out.println();
		}
		
		
	}
}
