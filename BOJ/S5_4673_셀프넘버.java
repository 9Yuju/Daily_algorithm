package Tutorial;

public class S5_4673_셀프넘버 {
	public static void main(String[] args) {
		boolean []x = new boolean[10001];//1부터 10000까지
		
		for (int i = 0; i < 10001; i++) {
			int n =num(i);
			if(n<10001) {
				x[n]=true;
			}
		}
		
		StringBuilder sb= new StringBuilder();
		for (int i = 1; i < 10001; i++) {
			if(x[i]==false) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	
	public static int num(int n) {
		int sum = n;
		
		while(true) {
			if(n==0) break;
			sum += n%10; //일의자리부터
			n = n/10;
		}
		return sum;
	}
}
