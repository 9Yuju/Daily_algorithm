package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class S3_1406_에디터 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();
		LinkedList<Character> list = new LinkedList<>();
		for (char c : s.toCharArray())
			list.add(c);
		int N = Integer.parseInt(reader.readLine());
		ListIterator<Character> iterator = list.listIterator(list.size());
		for (int i = 0; i < N; ++i) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			String cmd = tokenizer.nextToken();
			switch (cmd) {
			case "L":
				if (iterator.hasPrevious())
					iterator.previous();
				break;
			case "D":
				if (iterator.hasNext()) //
					iterator.next();
				break;
			case "B":
				if (iterator.hasPrevious()) {
					iterator.previous();
					iterator.remove();
				}
				break;
			case "P":
				iterator.add(tokenizer.nextToken().charAt(0));
				break;
			}
		}
		StringBuilder builder = new StringBuilder();
		for (char c : list)
			builder.append(c);
		System.out.println(builder.toString());
	}
}
