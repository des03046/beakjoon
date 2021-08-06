package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("");
        int sum = 0;
        for (int i = 0; i < T; i++) {
            sum += Integer.parseInt(s[i]);
        }
        System.out.println(sum);
    }
}
