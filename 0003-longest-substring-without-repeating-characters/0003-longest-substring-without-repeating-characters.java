class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> a=new HashMap<>();
        int n=0;
        int m=0;
        for(int i=0;i<s.length();i++){
            if(a.containsKey(s.charAt(i))){
                m=Math.max(m,a.get(s.charAt(i))+1);
            }
            a.put(s.charAt(i),i);
            n=Math.max(n, i - m + 1);
        }
        return n;
    }
}