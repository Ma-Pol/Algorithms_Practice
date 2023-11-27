import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Calendar seoul = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
        
        sb.append(seoul.get(Calendar.YEAR))
            .append("-")
            .append(seoul.get(Calendar.MONTH) + 1)
            .append("-")
            .append(seoul.get(Calendar.DATE));
        
        System.out.print(sb.toString());
    }
}