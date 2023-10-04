class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String result = "";
        
        for(String[] data : db)
            if(data[0].equals(id_pw[0]))
                if(data[1].equals(id_pw[1]))
                    result = "login";
                else 
                    result = "wrong pw";
        
        return result.length() == 0 ? "fail" : result;
    }
}