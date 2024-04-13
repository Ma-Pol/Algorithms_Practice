import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        for(int a = 2; a <= 100; a++)
            for(int b = 2; b <= a; b++)
                for(int c = b; c <= a; c++)
                    for(int d = c; d <= a; d++) {
                        int aCube = a * a * a;
                        int bCube = b * b * b;
                        int cCube = c * c * c;
                        int dCube = d * d * d;

                        if(aCube == bCube + cCube + dCube)
                            sb.append("Cube = ").append(a)
                                .append(", Triple = (")
                                .append(b).append(",")
                                .append(c).append(",")
                                .append(d).append(")\n");
                    }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}