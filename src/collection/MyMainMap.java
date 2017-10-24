package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyMainMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("첫번째", "수소");
		map.put("두번째", "헬륨");
		map.put("두번째", "리튬");
		map.put("세번째", "베릴륨");
		
		System.out.println(map.get("두번째"));
		
		Set set = map.keySet();
		
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(map.get(iter.next()));
		}
		
		map.remove("세번째");
		
		System.out.println(map.get("세번째"));
		
		
	}
}
