package PROGRAMMERS;
import java.util.*;
import java.io.*;

public class 토스1 {
	public static void main(String[] args) {
		String s = "12223";
		int answer = 0;

		if (s.length() < 3)
			answer = -1;
		String arr[] = { "999", "888", "777", "666", "555", "444", "333", "222", "111", "000" };
		
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			if (s.contains(arr[i])) {
				answer = Integer.parseInt(arr[i]);
				break;
			}
		}

		System.out.println(answer);
	}
}


//int answer = -1;
//
//if (s.length() < 3)
//	return -1;
//String arr[] = { "999", "888", "777", "666", "555", "444", "333", "222", "111", "000" };
//
//for (int i = 0; i < arr.length; i++) {
//	if (s.contains(arr[i])) {
//        answer = Integer.parseInt(arr[i]);
//        if(answer == 100) answer = 0;
//		break;
//	}
//}
//
//return answer;
