package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_2562_최댓값 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int [] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		int index = 0; 
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				index = i;
				max = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(index+1);
		
	}
}
