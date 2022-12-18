package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//for A+B-3
public class B3_10950_A더하기B3 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int A = Integer.parseInt(st.nextToken()); 
			int B = Integer.parseInt(st.nextToken());	
			System.out.println(A+B);
		}
		
		
	}
}
