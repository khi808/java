
public class ArrayEx {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int j = 1;
		for(int i = 0; i<arr.length; i++) {
			arr[i] += j;
			j++;
		}
		for(int i=0; i<arr.length; i++)
		System.out.println(arr[i]);
		
		byte[] byteArr = new byte[3];
		byteArr[0] = 100;
		
		System.out.println(byteArr[0]);
		System.out.println(byteArr[2]);
		System.out.println(byteArr[1]);
		
		//int i;
		//System.out.println(i);
		
		int[] arr2 = {2, 4312, -3332};
		
		String str = "집에 가고싶다";
		
		String[] strArr = new String[3];
		
		strArr[0] = "월요일";
		strArr[1] = "화요일";
		strArr[2] = "수요일";
		
		for (int i = 0 ; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		String[][] strArr2 = { 
				{"Mr. ", "Mrs. ", "Ms. " }, 
				{"Smith", "Jones"}
		};
		System.out.println(strArr2[1][0]);
	}
}
