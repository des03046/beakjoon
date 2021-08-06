package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class beakjoon3052 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int c = Integer.parseInt(br.readLine());
            a.add(String.valueOf(c % 42));
        }
        for (int i = 0; i < a.size(); i++) {
            if (!b.contains(a.get(i))) {
                b.add(a.get(i));
            }
        }
        System.out.println(b.size());
    }
}
