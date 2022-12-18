import java.util.Collections;
import java.util.PriorityQueue;

public class 프린터 {

	public static void main(String[] args) {
		int[] priorities = { 2, 1, 3, 2 };
		int location = 2;
		int answer = 0;

		PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < priorities.length; i++) {
			que.add(priorities[i]);
		}

		L: while (!que.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				if (que.peek() == priorities[i]) {
					if (i == location) {
						answer++;
						break L;
					}
					que.poll();
					answer++;
				}
			}
		}
		System.out.println(answer);

//		return answer;

	}

}
