import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int aLength = Integer.parseInt(input[0]);
        int bLength = Integer.parseInt(input[1]);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        input = br.readLine().split(" ");

        for(int i = 0; i < aLength; i++)
            a.add(Integer.parseInt(input[i]));


        input = br.readLine().split(" ");

        for(int i = 0; i < bLength; i++)
            b.add(Integer.parseInt(input[i]));


        Set<Integer> aMinusB = new HashSet<>(a);
        aMinusB.removeAll(b);

        Set<Integer> bMinusA = new HashSet<>(b);
        bMinusA.removeAll(a);

        System.out.print(aMinusB.size() + bMinusA.size());

        br.close();
    }
}
