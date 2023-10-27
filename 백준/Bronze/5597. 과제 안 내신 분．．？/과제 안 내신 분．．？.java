import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] students = new int[30];
        int first = 0, second = 0;
        
        String student = br.readLine();
        
        while(student != null) {
            int studentNum = Integer.parseInt(student);
            
            students[studentNum - 1] = 1;
            
            student = br.readLine();
        }
        
        for(int i = 0; i < students.length; i++)
            if(students[i] == 0)
                if(first == 0)
                    first = i + 1;
                else
                    second = i + 1;
        
        System.out.println(first);
        System.out.print(second);
        
        br.close();
    }
}