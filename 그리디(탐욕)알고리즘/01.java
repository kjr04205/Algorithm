import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 전체학생수 - 도난당한 학생수 = 체육수업을 들을 수 있는 학생
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        // reserve => 여벌의 체육복을 가져온 학생들의 번호
        // 여벌 체육복을 가져온 학생이 도난당한 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        // 도난당한 학생에게 체육복 빌려주는 경우
        for(int i = 0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}