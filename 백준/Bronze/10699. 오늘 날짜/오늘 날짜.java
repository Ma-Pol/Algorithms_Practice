import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalDate seoulToday = LocalDate.now(ZoneId.of("Asia/Seoul"));
        
        System.out.println(seoulToday);
    }
}