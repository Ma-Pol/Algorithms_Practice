class Solution {
    public boolean isPalindrome(int x) {
        // x가 음수이거나
        // 양수이면서 10으로 나누어 떨어지면 항상 false
        if(x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        // 계산용 숫자 num
        int num = 0;

        // x가 num보다 클 때까지 반복
        while(x > num) {

            // num에 10을 곱한 뒤, x를 10으로 나눈 나머지를 더함
            // 그 후 x를 10으로 나눔

            // 예 1: x = 242
            // num = 2 , x = 24 ==> num = 24 , x = 2
            
            // 예 2: x = 22
            // num = 2 , x = 2

            // 예 3: x = 254
            // num = 4 , x = 25 ==> num = 45 , x = 2
            num = num * 10 + x % 10;
            x = x / 10;
        }

        // x와 num이 일치하거나, x와 num / 10이 일치하면 true, 아니면 false
        // 예 1: x = 2 , num = 24 ==> x == num / 10
        // 예 2: x = 2 , num = 2 ==> x == num
        // 예 3: x = 2 , num = 45 ==> x != num && x != num / 10
        return (x == num || x == num / 10);
    }
}