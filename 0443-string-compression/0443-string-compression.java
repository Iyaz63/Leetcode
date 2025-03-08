class Solution {
    public int compress(char[] chars) {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            for (int j = i + 1; j < chars.length && chars[i] == chars[j]; j++) {
                count++;
                i = j;
            }
            s += chars[i];
            if (count > 1) {
                s += count;
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        
        return s.length();
    }
}