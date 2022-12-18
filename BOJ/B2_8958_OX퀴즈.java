package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_8958_OX퀴즈 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			String str = bf.readLine();
			String[] arr = str.split(""); 
			int score = 0, count =0;
			
			for (int j = 0; j < arr.length; j++) {
				if(arr[j].equals("O")) {
					count++;
				}else {
					count=0;
				}
				score += count;
			}
			sb.append(score).append("\n");
			
		}// 전체 for 
		
		System.out.println(sb);
		
	}
}
