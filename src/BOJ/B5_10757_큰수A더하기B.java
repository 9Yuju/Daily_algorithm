package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class B5_10757_큰수A더하기B {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		System.out.println(A.add(B));
	}
}
