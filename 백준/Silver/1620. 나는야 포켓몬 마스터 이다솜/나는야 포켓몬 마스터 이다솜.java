import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] nM = (br.readLine()).split(" ");
        int N = Integer.parseInt(nM[0]);
        int M = Integer.parseInt(nM[1]);
        
        Map<String, Integer> pokedexMap = new HashMap<>(N);
        String[] pokedexArr = new String[N];
        
        for(int i = 0; i < N; i++) {
            String tempPokemon = br.readLine();
            
            pokedexMap.put(tempPokemon, i + 1);
            pokedexArr[i] = tempPokemon;
        }
        
        
        
        while(M-- > 0) {
            String pokemon = br.readLine();
            
            if(main.isInteger(pokemon))
                sb.append(pokedexArr[Integer.parseInt(pokemon) - 1]);
            else
                sb.append(pokedexMap.get(pokemon));
            
            sb.append("\n");
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
    
    private boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        
        return true;
    }
}