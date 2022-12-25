package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4_10773_제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(bf.readLine());
        int sum = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int k = 0; k < K; k++) {
            int temp = Integer.parseInt(bf.readLine());
            if(temp == 0){
                stack.pop();
            }else{
                stack.add(temp);
            }
        }
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        System.out.println(sum);
    }
}
