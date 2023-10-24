import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] dices = (br.readLine()).split(" ");
		int dice1 = Integer.parseInt(dices[0]);
        int dice2 = Integer.parseInt(dices[1]);
        int dice3 = Integer.parseInt(dices[2]);
        
        int price = 0;
        
        if(dice1 == dice2 && dice2 == dice3) {
            price = 10000 + dice1 * 1000;
        } else if(dice1 != dice2 && dice1 != dice3 && dice2 != dice3) {
            price = 100 * Math.max(dice1, Math.max(dice2, dice3));
        } else if(dice1 == dice2) {
            price = 1000 + dice1 * 100;
        } else if(dice1 == dice3) {
            price = 1000 + dice1 * 100;
        } else {
            price = 1000 + dice3 * 100;
        }
        
		System.out.print(price);

		br.close();
	}
}