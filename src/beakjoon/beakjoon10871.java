package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class beakjoon10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");

        int s = Integer.parseInt(a[1]);
        int[] c = Arrays.stream(b).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] < s)
                sb.append(c[i]).append(" ");
        }
        System.out.println(sb);
    }
}
