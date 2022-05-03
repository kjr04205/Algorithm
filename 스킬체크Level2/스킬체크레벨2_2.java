import java.util.*;
class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length;
        int answer = arr[length - 1];
        while(true){
            int i = 0;
            for(; i<length; i++){
                if(answer % arr[i] != 0){
                    break;
                }
            }
            if(i == length){
                return answer;
            }
            else{
                answer++;
            }
        }

    }
}