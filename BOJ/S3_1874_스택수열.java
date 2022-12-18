package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S3_1874_스택수열 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		boolean flag = true;
		Stack<Integer> stack = new Stack<>();
		int idx = 1;
		L: for (int n = 0; n < N; n++) {
			int k = Integer.parseInt(bf.readLine());
			
			while(idx<=k) {
				stack.add(idx);
				idx++;
				sb.append("+").append("\n");
			}
			
			if(stack.peek()==k) {
				stack.pop();
				sb.append("-").append("\n");
			}else {
				flag = false;
				break L;
			}

		}
		if (flag) {
			System.out.println(sb);
		} else {
			System.out.println("NO");
		}
	}
}
