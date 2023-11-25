import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> stringSet = new HashSet<>();

        String S = br.readLine();

        for(int i = 0; i < S.length(); i++)
            for(int j = i + 1; j <= S.length(); j++)
                stringSet.add(S.substring(i, j));

        System.out.println(stringSet.size());

        br.close();
    }
}
