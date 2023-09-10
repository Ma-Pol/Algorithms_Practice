import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        // 아스키코드 97 ~ 122 : 소문자
        // 아스키코드 48 ~ 57 : 대문자
        
        if(1 <= a.length() && a.length() <= 20) {
            String result = "";
            char ch;
            
            for(int i = 0; i < a.length(); i++) {
                ch = a.charAt(i);
                
                if(97 <= ch && ch <= 122) {
                    result += a.substring(i, i + 1).toUpperCase();
                } else {
                    result += a.substring(i, i + 1).toLowerCase();
                }
            }
            
            System.out.println(result);
        }
        
        sc.close();
    }
}