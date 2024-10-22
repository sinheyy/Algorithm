import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //input
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); //집의 개수
        int c = Integer.parseInt(s[1]); //공유기의 개수

        long[] houses = new long[n];

        for(int i = 0; i < n; i++){
            houses[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(houses);

        //간격을 의미
        long left = 1;  //최소 간격
        long right = houses[n - 1] - houses[0]; //최대 간격
        long mid;
        long distance = 0;

        //이진 탐색 - 두 공유기 사이 최대 거리, 간격을 mid만큼 했을 때 공유기의 개수가 c개 이상이 되나요?
        while(left <= right){
            int cnt = 1;

            mid = (left + right) / 2;
            //System.out.println("mid" + mid);

            if(mid == 1){
                distance = 1;
                break;
            }

            int start = 0;
            //간격을 mid로 했을 때, 나오는 공유기의 개수 계산
            for(int i = 1; i < n; i ++){
                if(houses[i] - houses[start] >= mid){
                    cnt++;
                    start = i;
                }
            }
            //System.out.println(cnt+"cnt"+distance + "거리");


            //cnt가 최댓값이면 mid가 최대 거리
            if(cnt >= c && mid >= distance){
                distance = mid;
            }

            if(cnt < c){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }

        System.out.println(distance + "");

    }
}
