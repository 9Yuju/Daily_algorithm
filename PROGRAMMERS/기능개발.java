import java.util.ArrayList;
import java.util.Stack;

public class 기능개발 {

	public static void main(String[] args) {
		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 30, 5 };
		int[] answer;
		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> arr = new ArrayList<>();
		int max_day=0;
		for (int i = 0; i < speeds.length; i++) {
			double day = Math.ceil((double)(100 - progresses[i]) / speeds[i]);
			if(stack.size()==0) {
				max_day = (int)day;
				stack.add((int)day);
			}else {
				if(max_day < day) {
					arr.add(stack.size());
					stack.clear();
					max_day = (int)day;
				}
				stack.add((int)day);
			}
		}
		if(stack.size()!=0) {
			arr.add(stack.size());
		}
		answer = new int[arr.size()];
		for (int j = 0; j < answer.length; j ++) {
            answer[j] = arr.get(j);
        }
	}

}
