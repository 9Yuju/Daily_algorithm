package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4_10828_스택 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int x = -1;
		for (int n = 0; n < N; n++) {
			String[] str = bf.readLine().split(" ");
			String order = null;
			if (str.length == 2) { // push
				order = str[0];
				x = Integer.parseInt(str[1]);
				stack.add(x);
			} else { // 나머지
				order = str[0];
				switch (order) {
				case "top":
					if(stack.isEmpty()) {
						sb.append("-1").append("\n");
					}else {
						sb.append(stack.peek()).append("\n");
					}
					break;
				case "empty":
					if(stack.isEmpty()) {
						sb.append("1").append("\n");
					}else {
						sb.append("0").append("\n");
					}
					break;
				case "size":
					sb.append(stack.size()).append("\n");
					break;
				case "pop":
					if(stack.isEmpty()) {
						sb.append("-1").append("\n");
					}else {
						sb.append(stack.pop()).append("\n");
					}
					break;
				}
			}
		}
		System.out.println(sb);
		
	}
}
