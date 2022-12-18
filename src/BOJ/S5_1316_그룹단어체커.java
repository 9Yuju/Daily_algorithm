package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5_1316_그룹단어체커 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); //
		int count = 0;
		for (int n = 0; n < N; n++) {
			String str = bf.readLine();
			boolean[] check = new boolean[26];
			boolean isGroup = true;
			check[str.charAt(0)-'a'] = true;
			for (int i = 1; i < str.length(); i++) {
				if (str.charAt(i) != str.charAt(i - 1)) { //앞문자와 다르다면
					if (!check[str.charAt(i) - 'a']) {
						check[str.charAt(i) - 'a'] = true;
					}else { //이거에 해당되면 그룹단어가 아니다. 
						isGroup = false;
						break;
					}
				}else { //앞문자와 같다면
					continue;
				}
			}
			if(isGroup) {
				//System.out.println(str);
				count++;
			}

		}// n for
		System.out.println(count);

	}

}
