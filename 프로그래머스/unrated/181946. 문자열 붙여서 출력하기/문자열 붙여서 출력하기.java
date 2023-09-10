import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        if(1 <= a.length() && a.length() <= 10) {
            System.out.println(a + b);
        }
    }
}