package beakjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class beakjoon18870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int num[] = arr.clone();
        Arrays.sort(arr);

        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int n : arr) {
            if (!map.containsKey(n))
                map.put(n, cnt++);
        }

        StringBuilder sb = new StringBuilder();
        for (int n : num)
            sb.append(map.get(n)).append(' ');

        System.out.println(sb);
    }
}
