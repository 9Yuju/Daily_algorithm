package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_10870_피보나치수5 {
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine());
		System.out.println(func(N));
	}

	public static int func(int num) {
		if (num ==1) {
			return 1;
		}else if(num==0) {
			return 0;
		}
		return func(num-1)+func(num-2);
	}
}
