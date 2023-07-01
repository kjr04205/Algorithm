class Solution {
    public String solution(int num) {
        String answer = "";
        
        if(num % 2 == 0){
            answer = "Even";
            return answer;
            
        }else{
            answer = "Odd";
            return answer;
        }
    }
}