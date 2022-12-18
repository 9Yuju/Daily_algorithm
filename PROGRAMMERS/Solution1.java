import java.util.Collection;
import java.util.HashMap;

/**
 * 카모 문제
 * @author yuju
 *
 */
public class Solution1 {
	public static void main(String[] args) {
		String[] id_list = {"A B C D", "A D", "A B D", "B D"};
		int k = 2;
		
		int answer=0;
		HashMap<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < id_list.length; i++) {
			String[] cus = id_list[i].split(" ");
			for (int j = 0; j < cus.length; j++) {
				if(!map.containsKey(cus[j])) {
					map.put(cus[j], 1);
				}else {
					int temp = map.get(cus[j]);
					if(temp >= i+1) {
						
					}else {
						map.put(cus[j], temp+1);
					}
				}
			}
		}
	       Collection<Integer> values = map.values();
	       Integer[] arr = values.toArray(new Integer[0]);
	       
	       for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=k) {
				answer+=k;
			}else {
				answer+=arr[i];
			}
			
			
		}
	       System.out.println(answer);
		
		
	}
}
