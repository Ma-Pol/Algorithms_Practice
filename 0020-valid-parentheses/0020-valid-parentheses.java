class Solution {
    public boolean isValid(String s) {
        boolean result = true;
        Stack<Character> stk = new Stack<>();

        loop:
        for(char ch : s.toCharArray()) {
            switch(ch) {
                case ')':
                    if(stk.empty() || stk.pop() != '(') {
                        result = false;
                        break loop;
                    }
                    break;
                case '}':
                    if(stk.empty() || stk.pop() != '{') {
                        result = false;
                        break loop;
                    }
                    break;
                case ']':
                    if(stk.empty() || stk.pop() != '[') {
                        result = false;
                        break loop;
                    }
                    break;
                default:
                    stk.push(ch);
                    break;
            }
        }

        return stk.empty() ? result : false;
    }
}