class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        // a = 3
        // b = 5
        // 3+4+5

        if(a>b){
            for(; b<=a; b++){
                answer = answer + b;
            }
        }

        else if(a == b){
            answer = answer + a;
        }

        else if(b>a){
            for(; a<=b; a++){
                answer = answer + a;
            }
        }

        return answer;
    }
}