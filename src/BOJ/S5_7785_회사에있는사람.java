package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class S5_7785_회사에있는사람 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
//		List<String> list = new ArrayList<>();
//		HashMap<Integer, String> map = new HashMap<>();
		HashSet<String> set = new HashSet<>();
		int cnt = 0;
		for (int n = 0; n < N; n++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String name = st.nextToken();
			String temp = st.nextToken();
			if (temp.equals("enter")) {
				set.add(name);
			} else if (temp.equals("leave")) {
				if (set.contains(name)) {
					set.remove(name);
				}
			}
		}
		List<String> list = new ArrayList<>(set);
		Collections.sort(list, Collections.reverseOrder());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
