import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, String> employeeMap = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        while(N-- > 0) {
            String[] employee = (br.readLine()).split(" ");
            String name = employee[0];
            String state = employee[1];

            if(!employeeMap.containsKey(name)) {
                employeeMap.put(name, state);
            } else {
                employeeMap.remove(name);
            }
        }

        List<String> employeeList = new ArrayList<>(employeeMap.keySet());
        Collections.sort(employeeList, Collections.reverseOrder());

        for(String name : employeeList)
            sb.append(name).append("\n");

        System.out.print(sb.toString());

        br.close();
    }
}