package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (!(str = br.readLine()).equals("0")) {
            String[] a = str.split("");
            int i = 0, j = a.length - 1;
            while (true) {
                if (i < j) {
                    if (a[i].equals(a[j])) {
                        i++;
                        j--;
                    } else {
                        System.out.println("no");
                        break;
                    }
                } else {
                    System.out.println("yes");
                    break;
                }
            }
        }
    }
}
