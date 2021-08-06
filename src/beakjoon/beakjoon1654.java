package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");

        int K = Integer.parseInt(a[0]);//랜선 개수
        int N = Integer.parseInt(a[1]);//랜선 만들 개수
        int[] line = new int[K];//가진 랜선 길이
        long end = 0;
        long start = 1;

        for (int i = 0; i < K; i++) {
            line[i] = Integer.parseInt(br.readLine());
            end = Math.max(end, line[i]);
        }

        while (start <= end) {
            long mid = (start + end) / 2;
            int sum = 0;

            for (int i = 0; i < K; i++) {
                sum += (line[i] / mid);
            }
            if (sum >= N) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        System.out.println(end);
    }
}
