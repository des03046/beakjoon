package beakjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon18111 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int time = 2147000000;
        int height = -1;
        int map[][] = new int[n][m];
        int max=-1, min=time ;
        for(int i = 0 ; i < n ; i ++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < m ; j++) {
                int now = Integer.parseInt(st.nextToken());
                map[i][j] = now;
                if(now > max) max = now;
                if(now < min) min = now;
            }
        }

        for(int i = max ; i >= min ; i--) {
            int cnt = 0;
            int bag = b;
            int target = i;
            boolean isCompute = true;

            for(int y = 0 ; y < n ; y ++) {
                for(int  x= 0 ; x < m ; x++) {
                    if(map[y][x] == target) continue;
                    else {
                        int diff = Math.abs(target - map[y][x]);
                        if(target > map[y][x]) {
                            bag -= diff;
                            cnt +=diff;
                        } else {
                            bag += diff;
                            cnt += (2*diff);
                        }

                    }
                }
            }
            if(bag< 0) {
                continue;
            }
            if(isCompute &&cnt < time) {
                time = cnt;
                height = target;
            }
        }
        System.out.println(time + " " + height );
    }
}
