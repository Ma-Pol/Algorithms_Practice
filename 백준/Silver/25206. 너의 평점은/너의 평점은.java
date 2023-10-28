import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double creditSum = 0.0;
        double gradeSum = 0.0;
        
        String tempStr = br.readLine();
        
        while(tempStr != null) {
            String[] temp = tempStr.split(" ");
            tempStr = br.readLine();
            
            double tempCredit = Double.parseDouble(temp[1]);
            double tempGrade = 0.0;
            
            switch(temp[2]) {
                case "A+":
                    tempGrade = 4.5;
                    break;
                case "A0":
                    tempGrade = 4.0;
                    break;
                case "B+":
                    tempGrade = 3.5;
                    break;
                case "B0":
                    tempGrade = 3.0;
                    break;
                case "C+":
                    tempGrade = 2.5;
                    break;
                case "C0":
                    tempGrade = 2.0;
                    break;
                case "D+":
                    tempGrade = 1.5;
                    break;
                case "D0":
                    tempGrade = 1.0;
                    break;
                case "F":
                    tempGrade = 0.0;
                    break;
                default:
                    continue;
            }
            
            creditSum += tempCredit;
            gradeSum += tempCredit * tempGrade;            
        }
        
        System.out.print(creditSum == 0.0 ? 0.000000 : String.format("%.6f", gradeSum / creditSum));
        
        br.close();
    }
}