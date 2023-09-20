import java.time.LocalDate;

class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDate lDate1 = LocalDate.of(date1[0], date1[1], date1[2]), 
                    lDate2 = LocalDate.of(date2[0], date2[1], date2[2]);
        
        
        
        return lDate1.isBefore(lDate2) ? 1 : 0;
    }
}