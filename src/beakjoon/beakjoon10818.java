package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class beakjoon10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        String[] a = br.readLine().split(" ");
        for (int i = 0; i < t; i++) {
            arr.add(Integer.parseInt(a[i]));
        }
        int max = Collections.max(arr);
        int min = Collections.min(arr);
        System.out.println(min + " " + max);
    }
}
