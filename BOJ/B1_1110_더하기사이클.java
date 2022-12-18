package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_1110_더하기사이클 {
	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		int T = n;
		int count = 0;
		do {
			n = ((n%10)*10)+(((n/10)+(n%10))%10);
			count++;
		} while (!(T==n));
		System.out.println(count);
		
//		int a = 0, b = 0;
//		a = n / 10;
//		b = n % 10;
//
//		int count = 0;
//		int x = 0, k = 0;
//		if(n==0) {
//			System.out.println(1);
//		}else {
//		while (!(k == n)) {
//			x = a + b;
//			if (x >= 10)
//				x = x % 10;
//			k = b * 10 + x;
//
//			a = k / 10;
//			b = k % 10;
//			count++;
//
//		}
//		// 출력
//		System.out.println(count);
//		}
	}
}
