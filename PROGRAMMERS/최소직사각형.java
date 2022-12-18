
public class 최소직사각형 {

	public static void main(String[] args) {
		int[][] size = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
		int answer = 0;

		int X = 0;
		int Y = 0;

		for (int i = 0; i < size.length; i++) {
			int x = size[i][0];
			int y = size[i][1];

			if (x >= y) {
				X = x > X ? x : X;
				Y = y > Y ? y : Y;
			} else {
				Y = x > Y ? x : Y;
				X = y > X ? y : X;
			}
		}
		answer = X * Y;
		System.out.println(answer);

	}

}
