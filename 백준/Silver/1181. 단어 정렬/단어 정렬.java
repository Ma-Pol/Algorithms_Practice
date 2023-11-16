import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        Set<String> stringSet = new HashSet<>(); // 중복 제거용 HashSet
        
        while(N-- > 0)
            stringSet.add(br.readLine());
        
        String[] stringArr = stringSet.toArray(new String[stringSet.size()]); // 정렬을 위해 배열화
        
        Arrays.sort(stringArr, (str1, str2) -> {
            // 길이가 같다면 단순 오름차순 비교 정렬
            if(str1.length() == str2.length())
                return str1.compareTo(str2);
            // 길이가 다르다면 짧은 순으로 정렬
            else
                return str1.length() > str2.length() ? 1 : -1;
        });
        
        for(String str : stringArr)
            sb.append(str).append("\n");
        
        System.out.print(sb.toString());
        
        br.close();
    }
}
