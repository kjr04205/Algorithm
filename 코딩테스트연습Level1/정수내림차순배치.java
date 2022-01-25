import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;

        String tmp = String.valueOf(n);
        String[] arrs = tmp.split("");

        Arrays.sort(arrs);

        tmp = "";
        for(int i=arrs.length-1; i>=0; i--){
            tmp = tmp + arrs[i];
        }

        return Long.parseLong(tmp);
    }
}