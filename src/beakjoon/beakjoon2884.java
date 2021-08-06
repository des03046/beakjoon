package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon2884 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int H = Integer.parseInt(a[0]);
        int M = Integer.parseInt(a[1]);

        int count = M - 45;
        if (count < 0) {
            H -= 1;
            M = 60 + count;
        } else {
            M = count;
        }

        if (H < 0) {
            H = 24 + H;
        }
        System.out.println(H + " " + M);
    }
}
