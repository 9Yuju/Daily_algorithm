package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_2558_A더하기B2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Integer.parseInt(bf.readLine())+Integer.parseInt(bf.readLine()));
	}
}
