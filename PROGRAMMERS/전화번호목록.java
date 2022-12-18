import java.util.Arrays;

public class 전화번호목록 {
	public static void main(String[] args) {
		String[] phone_book= {"123","456","789"};
		boolean answer = true;
		Arrays.sort(phone_book);
		for (int i = 0; i < phone_book.length-1; i++) {
			if(phone_book[i+1].startsWith(phone_book[i])){
				answer = false;
				break;
			}
		}
		System.out.println(answer);
		
	}
}
