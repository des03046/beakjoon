package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon9498 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        if (89 < T && T < 101) {
            System.out.println("A");
        } else if (79 < T && T < 90) {
            System.out.println("B");
        } else if (69 < T && T < 80) {
            System.out.println("C");
        } else if (59 < T && T < 70) {
            System.out.println("D");
        } else
            System.out.println("F");
    }

}
