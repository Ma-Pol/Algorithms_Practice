class Solution {
    public String solution(int[] numLog) {
        String result = "";
        
        if(2 <= numLog.length && numLog.length <= 100000 &&
          -100000 <= numLog[0] && numLog[0] <= 100000) {
            loop:
            for(int x = 0; x < numLog.length - 1; x++) {
                switch(numLog[x + 1] - numLog[x]) {
                    case 1:
                        result += "w";
                        break;
                    case -1:
                        result += "s";
                        break;
                    case 10:
                        result += "d";
                        break;
                    case -10:
                        result += "a";
                        break;
                    default:
                        result = "";
                        break loop;
                }
            }
        }
        
        return result;
    }
}