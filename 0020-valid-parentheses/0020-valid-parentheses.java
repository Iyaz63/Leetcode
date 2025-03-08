class Solution {
    public boolean isValid(String s) {
        Stack<Character> a = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!a.isEmpty() && 
                ((ch == ')' && a.peek() == '(') || 
                 (ch == '}' && a.peek() == '{') || 
                 (ch == ']' && a.peek() == '['))) {
                a.pop();
            } else {
                a.push(ch);
            }
        }
        return a.isEmpty();
    }
}