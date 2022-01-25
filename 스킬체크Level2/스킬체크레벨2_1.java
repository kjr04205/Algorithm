import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = Integer.bitCount(n);

        while(answer != Integer.bitCount(++n));

        return n;

    }
}