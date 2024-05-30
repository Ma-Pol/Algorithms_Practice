import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().split(" ");
            
            int inOrder = calcArray(input, true);
            int inReverse = calcArray(input, false);
            
            System.out.printf("%d\n%d", Math.min(inOrder, inReverse), Math.max(inOrder, inReverse));
        } catch(IOException e) {
            e.getStackTrace();
        }
    }

    static int calcArray(String[] input, boolean isOrder) {
        int res,
            a = Integer.parseInt(input[0]),
            b = Integer.parseInt(input[2]),
            c = Integer.parseInt(input[4]);
            
        if(isOrder) {
            res = calc(a, b, input[1]);
            res = calc(res, c, input[3]);
        } else {
            res = calc(b, c, input[3]);
            res = calc(a, res, input[1]);
        }
        
        return res;
    }

    static int calc(int a, int b, String oper) {
        switch(oper) {
            case "+":
                a += b;
                break;
            case "-":
                a -= b;
                break;
            case "*":
                a *= b;
                break;
            case "/":
                a /= b;
                break;
        }
        
        return a;
    }
}