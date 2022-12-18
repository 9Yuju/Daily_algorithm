package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class S4_10866_덱 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		Deque<Integer> deq = new ArrayDeque<>();

		StringBuilder sb = new StringBuilder();
		int x = -1;
		for (int n = 0; n < N; n++) {
			String[] str = bf.readLine().split(" ");
			String order = null;
			if (str.length == 2) { // push
				order = str[0];
				x = Integer.parseInt(str[1]);
				switch (order) {
				case "push_front":
					deq.addFirst(x);
					break;
				case "push_back":
					deq.addLast(x);
					break;
				}
			} else { // 나머지
				order = str[0];
				switch (order) {
				case "pop_front":
					if (deq.isEmpty()) {
						sb.append("-1").append("\n");
					} else {
						sb.append(deq.pollFirst()).append("\n");
					}
					break;
				case "pop_back":
					if (deq.isEmpty()) {
						sb.append("-1").append("\n");
					} else {
						sb.append(deq.pollLast()).append("\n");
					}
					break;
				case "empty":
					if (deq.isEmpty()) {
						sb.append("1").append("\n");
					} else {
						sb.append("0").append("\n");
					}
					break;
				case "size":
					sb.append(deq.size()).append("\n");
					break;
				case "front":
					if (deq.isEmpty()) {
						sb.append("-1").append("\n");
					} else {
						sb.append(deq.peekFirst()).append("\n");
					}
					break;
				case "back":
					if (deq.isEmpty()) {
						sb.append("-1").append("\n");
					} else {
						sb.append(deq.peekLast()).append("\n");
					}
					break;
				}
			}
		}
		System.out.println(sb);
	}
}
