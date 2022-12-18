package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class G5_2493_탑 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());

		Stack<int[]> stack = new Stack<>();
		
		
		for (int i = 1; i <= N; i++) {
			int top = Integer.parseInt(st.nextToken());
			
			while (!stack.isEmpty()) {
				if (stack.peek()[1] >= top) {
					System.out.print(stack.peek()[0] + " ");
					break;
				}
				stack.pop();
			}
			if (stack.isEmpty()) {
				System.out.print("0 ");
			}
			stack.push(new int[]{ i, top });
		}

	}
}
