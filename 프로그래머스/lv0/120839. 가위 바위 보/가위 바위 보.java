class Solution {
    public String solution(String rsp) {
        // String += 하는것보다 더 빠름
        StringBuilder sb = new StringBuilder();
        
        for(String str : rsp.split("")) {
            switch(str) {
                case "0":
                    sb.append("5");
                    break;
                case "2":
                    sb.append("0");
                    break;
                case "5":
                    sb.append("2");
                    break;
            }
        }
        
        return sb.toString();
    }
}