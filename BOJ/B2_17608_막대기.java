package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B2_17608_막대기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); //막대기의 개수
		Stack<Integer> stack = new Stack<>();
		for (int n = 0; n < N; n++) {
			stack.add(Integer.parseInt(bf.readLine()));
		}// n for
		int temp = stack.pop();
		int count =1;
		while(!stack.isEmpty()) {
			int x = stack.pop();
			if(x>temp) {
				temp = x;
				count++;
			}
		}
		System.out.println(count);
	}

}
