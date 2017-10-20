
public class forEx {
	public static void main(String args[]) {
		
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println();
		
		int[] arr = {2, 3, 4, 5};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String[][] names = { 
				{"Mr. ", "Mrs. ", "Ms. " }, 
				{"Smith", "Jones"}
		};
		
		for (int i =0; i < names.length;  i++) {
			for (int j = 0; j<names[i].length; j++) {
				System.out.println(names[i][j]);
			}
		}
		
		// 3항 연산자
		
		int age = 15;
		String str = age > 15 ? "old" : "young" ;
		
		System.out.println(str);
	}
}
