import java.io.*;
import java.util.*;

public class Main {
    private int[] cardArr;
    private int[] numberArr;
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        Main main = new Main();

        main.arrayInit(ArrayType.CARD);
        main.arrayInit(ArrayType.NUMBER);

        Arrays.sort(main.cardArr);

        main.searchNumber();

        System.out.print(main.sb.toString());

        main.br.close();
    }
    
    private void arrayInit(ArrayType type) throws IOException {
        int length = Integer.parseInt(this.br.readLine());
        int[] arr = new int[length];
        StringTokenizer token = new StringTokenizer(this.br.readLine());

        for(int i = 0; i < length; i++)
            arr[i] = Integer.parseInt(token.nextToken());

        if(type == ArrayType.CARD)
            this.cardArr = arr;
        else
            this.numberArr = arr;
    }
    
    private void searchNumber() {
        for(int i = 0; i < this.numberArr.length; i++) {
            int left = 0;
            int right = this.cardArr.length - 1;
            int mid = 0;
            boolean isExist = false;

            while(left <= right) {
                mid = (left + right) / 2;

                if(this.cardArr[mid] == this.numberArr[i]) {
                    isExist = true;
                    break;
                } else if(this.cardArr[mid] < this.numberArr[i]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if(isExist)
                this.sb.append("1 ");
            else
                this.sb.append("0 ");
        }
    }
    
    private enum ArrayType {
        CARD, NUMBER
    }
}