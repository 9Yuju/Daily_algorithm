package PROGRAMMERS;
import java.util.HashMap;

public class 폰켓몬 {

	public static void main(String[] args) {
		int[] nums = { 3, 1, 2, 3 };

		int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], 1);
		}
		System.out.println(map.size());
		System.out.println(nums.length / 2);
		answer = (map.size() <= (nums.length / 2)) ? map.size() : nums.length/2;

//	        return answer;
		System.out.println(answer);

	}

}
