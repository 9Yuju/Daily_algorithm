package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_1546_평균 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		double score [] = new double[N];
		for (int i = 0; i < score.length; i++) {
			score[i]= Integer.parseInt(st.nextToken());
		}
		
		//최대값구하기
		double max = score[0];
		for (int i = 0; i < score.length; i++) {
			if(max<score[i]) max = score[i];
		}
		//값 바꾸기 
		for (int i = 0; i < score.length; i++) {
			score[i] = score[i] / max *100;
		}
		//새로운 평균
		double sum = 0,avg = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = sum / score.length;
		System.out.println(avg);
	}
}
