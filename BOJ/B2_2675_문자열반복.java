package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_2675_문자열반복 {
	public static void main(String[] args) throws  IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine()); //전체횟수
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine()," ");
			
			int R = Integer.parseInt(st.nextToken()); //반복횟수
			String S = st.nextToken();
			
			for (int j = 0; j < S.length(); j++) {
				for (int j2 = 1; j2 <= R; j2++) {
					sb.append(S.charAt(j));
				}
				
			}
			System.out.println(sb);	
			sb.setLength(0);
		}//for
		
	}
}
