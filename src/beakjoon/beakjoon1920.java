package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class beakjoon1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] a = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();

        Arrays.sort(a);

        int M = Integer.parseInt(br.readLine());

        int[] b = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < b.length; i++) {
            int max = N;
            int min = -1;
            int mid;
            int flag = 0;

            while (max - min > 1) {
                mid = (min + max) / 2;

                if (b[i] == a[mid]) {
                    flag = 1;
                    break;
                } else if (b[i] > a[mid]) {
                    min = mid;
                } else
                    max = mid;
            }
            sb.append(flag).append("\n");
        }
        System.out.println(sb);
    }
}
