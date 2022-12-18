package PROGRAMMERS;
import java.util.HashMap;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		String answer = "";
		HashMap<String,Integer> map = new HashMap<>();
		for (int i = 0; i < participant.length; i++) {
			if(map.containsKey(participant[i])) {
				int temp = map.get(participant[i])+1;
				map.put(participant[i], temp);
			}else map.put(participant[i], 1);
		}
		
		for (int i = 0; i < completion.length; i++) {
			if(map.containsKey(completion[i])) {
				int temp = map.get(completion[i])-1;
				map.put(completion[i], temp);
			}
		}
		
		for (int i = 0; i < participant.length; i++) {
			if(map.get(participant[i])!=0) {
				answer = participant[i];
				break;
			}
		}
		
		System.out.println(answer);
	}

}
