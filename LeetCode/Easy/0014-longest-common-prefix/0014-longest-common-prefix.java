class Solution {
    public String longestCommonPrefix(String[] strs) {
      String result = "";

      // strs의 길이가 0이라면 strs[0]의 문자열 자체가 최대 길이 접두사
      if(strs.length == 1) return strs[0];

      // strs 내 요소 중 길이가 0인 문자열이 있다면 접두사 없음
      for(String str : strs) {
        if(str.length() == 0) return "";
      }

      loop: 
      for(int i = 1; i <= strs[0].length(); i++) {
        // 0번 문자열을 기준으로 한 자리씩 접두사를 늘려감
        String temp = strs[0].substring(0, i);

        // 나머지 문자열들과 비교
        for(String str : strs) {
          int check = str.indexOf(temp);

          // temp가 0번째 위치에 존재한다면 continue
          // 없거나 그 외의 자리에 있다면 더 볼 것도 없이 break loop
          if(check == 0) {
            continue;
          } else {
            break loop;
          }
        }

        // 위 반복문에서 아무 문제 없이 모두 continue 되었다면 도달
        // result에 현재 접두사를 저장
        // 이후 접두사의 범위를 늘려서 재탐색
        result = temp;
      }

      return result;
    }
}