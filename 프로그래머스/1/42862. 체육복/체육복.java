class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int result = n;
        int[] students = new int[n + 2];
        
        // 체육복을 도난당한 학생 = -1
        for(int lostStudent : lost)
            students[lostStudent]--;
        
        // 여벌 체육복이 있는 학생 = 1
        for(int reserveStudent : reserve)
            students[reserveStudent]++;
        
        
        for(int i = 1; i < students.length - 1; i++)
            if(students[i] == -1)
                if(students[i - 1] == 1) {
                    students[i - 1]--;
                    students[i]++;
                } 
                else if(students[i + 1] == 1) {
                    students[i + 1]++;
                    students[i]++;
                } 
                else {
                    result--;
                }
        
        return result;
    }
}