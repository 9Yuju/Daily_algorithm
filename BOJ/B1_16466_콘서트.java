package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B1_16466_콘서트 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		PriorityQueue<Integer> que = new PriorityQueue<>();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for (int n = 0; n < N; n++) {
			que.offer(Integer.parseInt(st.nextToken()));
		}
		int temp = 0;
		int x =0;
		while(true) {
			if(que.isEmpty()) {
				System.out.println(x+1);
				break;
			}
			x=que.poll();
			if(x-temp!=1) {
				System.out.println(temp+1);
				break;
			}else {
				temp=x;
			}
		}
	}
}
