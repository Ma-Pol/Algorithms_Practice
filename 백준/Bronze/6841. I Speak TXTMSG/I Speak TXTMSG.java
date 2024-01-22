import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        loop:
        while(true) {
            String shortForm = br.readLine();
            
            switch(shortForm) {
                case "CU":
                    sb.append("see you");
                    break;
                case ":-)":
                    sb.append("I’m happy");
                    break;
                case ":-(":
                    sb.append("I’m unhappy");
                    break;
                case ";-)":
                    sb.append("wink");
                    break;
                case ":-P":
                    sb.append("stick out my tongue");
                    break;
                case "(~.~)":
                    sb.append("sleepy");
                    break;
                case "TA":
                    sb.append("totally awesome");
                    break;
                case "CCC":
                    sb.append("Canadian Computing Competition");
                    break;
                case "CUZ":
                    sb.append("because");
                    break;
                case "TY":
                    sb.append("thank-you");
                    break;
                case "YW":
                    sb.append("you’re welcome");
                    break;
                case "TTYL":
                    sb.append("talk to you later");
                    break;
                default:
                    sb.append(shortForm);
                    break;
            }
            
            if(shortForm.equals("TTYL")) break;
            
            sb.append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}