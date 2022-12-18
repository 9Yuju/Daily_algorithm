package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4_9012_괄호 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String temp = bf.readLine();
			Stack<Character> stack = new Stack<>();
			boolean flag = true;
			L: for (int len = 0; len < temp.length(); len++) {
				char c = temp.charAt(len);
				if (c == '(') {
					stack.add(c);
				} else {
					if (stack.isEmpty()) {
						flag = false;
						break L;
					} else {
						stack.pop();
					}
				}
			}

			if (!stack.isEmpty()) {
				flag = false;
			}

			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		} // tc
	}
}
