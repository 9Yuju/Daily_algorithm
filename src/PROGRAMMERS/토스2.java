package PROGRAMMERS;
import java.util.*;
import java.io.*;

public class 토스2 {
	public static void main(String[] args) {
		int[] levels = {1,2};
		int answer = 0;
		
		Integer[] arr = Arrays.stream(levels).boxed().toArray(Integer[]::new);
		
		Arrays.sort(arr, Collections.reverseOrder());
		
//		for (Integer integer : arr) {
//			System.out.println(integer);
//		}
//		
		
		int length = (int)Math.floor(levels.length/4)-1;
		
		if(length < 0) {
			answer = -1;
		}else {
			answer = arr[length];
			
		}
		
//		System.out.println(length);
		
		System.out.println(answer);
		
	}
}
