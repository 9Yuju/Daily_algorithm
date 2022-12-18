package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B4_10845_큐 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		Queue<Integer> que = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int x = -1;
		for (int n = 0; n < N; n++) {
			String[] str = bf.readLine().split(" ");
			String order = null;
			if (str.length == 2) { // push
				order = str[0];
				x = Integer.parseInt(str[1]);
				que.offer(x);
			} else { // 나머지
				order = str[0];
				switch (order) {
				case "front":
					if(que.isEmpty()) {
						sb.append("-1").append("\n");
					}else {
						sb.append(que.peek()).append("\n");
					}
					break;
				case "back":
					if(que.isEmpty()) {
						sb.append("-1").append("\n");
					}else {
						sb.append(x).append("\n");
					}
					break;
				case "empty":
					if(que.isEmpty()) {
						sb.append("1").append("\n");
					}else {
						sb.append("0").append("\n");
					}
					break;
				case "size":
					sb.append(que.size()).append("\n");
					break;
				case "pop":
					if(que.isEmpty()) {
						sb.append("-1").append("\n");
					}else {
						sb.append(que.poll()).append("\n");
					}
					break;
				}
			}
		}
		System.out.println(sb);
	}
}
