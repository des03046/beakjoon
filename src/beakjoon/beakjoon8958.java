package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon8958 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] a = br.readLine().split("");
            int count = 0;
            int point = 1;
            for (int j = 0; j < a.length; j++) {
                if (a[j].equals("O")) {
                    count += point++;
                } else
                    point = 1;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

}
