import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        boolean check = true;
        Queue<String> qCards1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> qCards2 = new LinkedList<>(Arrays.asList(cards2));
        
        for(String str : goal) {
            if(str.equals(qCards1.peek())) {
                qCards1.poll();
            } 
            else if(str.equals(qCards2.peek())) {
                qCards2.poll();
            } 
            else {
                check = false;
                break;
            }
        }
        
        return check ? "Yes" : "No";
    }
}