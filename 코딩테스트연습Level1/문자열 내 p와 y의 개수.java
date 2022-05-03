class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String list[] = s.split("");
        int p = 0;
        int y = 0;


        for(int i=0; i<s.length(); i++){
            if(list[i].equals("p") || list[i].equals("P")){
                p = p+1;
            }
            if(list[i].equals("y") || list[i].equals("Y")){
                y = y+1;
            }
        }

        if(p != y){
            answer = false;
        }

        return answer;
    }
}