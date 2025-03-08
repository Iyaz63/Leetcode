class Solution {
    public int maxVowels(String s, int k) {
         int m = 0, n = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) n++;
        }
        m = n;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) n++;
            if (isVowel(s.charAt(i - k))) n--;
            m = Math.max(m, n);
        }

        return m;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}