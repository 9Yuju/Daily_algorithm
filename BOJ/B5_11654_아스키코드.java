package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_11654_아스키코드 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char s = bf.readLine().charAt(0);
		int a = (int)s;
		System.out.println(a);
	}
}
