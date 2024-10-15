import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Set<String> aSet = new TreeSet(List.of(br.readLine().split(" ")));
        int M = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");

        for (String number : numbers) {
            sb.append(aSet.contains(number) ? 1 : 0).append("\n");
        }

        System.out.println(sb);
    }
}