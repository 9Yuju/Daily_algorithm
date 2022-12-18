package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S3_1935_후위표기식2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());// 피연산자의 개수
		String st = bf.readLine();
		// A는 65? Z는 90
		double[] arr = new double[N];
		for (int n = 0; n < N; n++) {
			arr[n] = Integer.parseInt(bf.readLine());
		}
		Stack<Double> stack = new Stack<>();
		for (int s = 0; s < st.length(); s++) {
			char c = st.charAt(s);
//			System.out.println("c:"+c);
			if (65 <= ((int) c) && ((int) c) <= 90) { // A,B,C 숫자면
				stack.add(arr[((int) c - 65)]);
			} else { // 기호면
				double result = 0;
				double x = stack.pop();
				double y = stack.pop();
				switch (c) {
				case '+':
					result=x+y;
					break;
				case '*':
					result=x*y;
					break;
				case '/':
					result=y/x;
					break;
				case '-':
					result=y-x;
					break;
				}
				stack.add(result);
//				System.out.println("x:"+x+", y:"+y);
//				System.out.println("result:"+result);
			}
//			System.out.println("-------------");
		}
		double temp = stack.pop();
		System.out.printf("%.2f",temp);
	}
}
