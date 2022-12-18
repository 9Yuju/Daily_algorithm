package Tutorial;

import java.util.Scanner;

public class G5_9663_NQueen {
	static int N,ans;
	static int col[]; //열번호를 기억하고 있는 배열
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		col = new int[N+1];
		
		setQueen(1);
		System.out.println(ans);
	}
	
	
	
	public static void setQueen(int rowNo) { // rowNo : 퀸을 두어야 하는 현재 행, col[rowNo] 현재 열 
		
		//가지치기
		if(!isAvailable(rowNo-1)) return; //이미 재귀로 타고 넘어왔으니까 조금전에 넣은 애가 불가능하면 되돌리기 
		
		//기저조건 : 퀸을 모두 놓았다면
		if(rowNo>N) { // 얘가 무조건 답이 될 수 있는 이유 : 안되는것을 가지치기로 이미 다 잘라냈기때문에 무조건 답.
			ans++;
			return;
		}
		
		//1열 부터 - n열까지 퀸을 놓는 시도
		for (int i = 1; i <= N; i++) {
			col[rowNo]=i;
			setQueen(rowNo+1);
		}
	}
	
	public static boolean isAvailable(int rowNo) { //rowNo:놓아진 마지막퀸
		//여기까지 가능하다!
		
		for (int i = 1; i < rowNo; i++) {
			// 기존 퀸이랑 i의 열번호가 같거나 행의 변화량의 차이가 열의 변화량과 같으면(대각선) false
			if(col[rowNo] == col[i] || rowNo-i == Math.abs(col[rowNo]-col[i])) return false; 
		}
		return true;
	}
}
