class Solution {
    public String reverseVowels(String s) {
        char [] a=s.toCharArray();
        ArrayList<Character> b=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(a[i]=='a'|| a[i]=='e'||a[i]=='i' || a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'){
                b.add(a[i]);
            }
        }
        int j=b.size()-1;
        for(int i=0;i<s.length();i++){
            if(a[i]=='a'|| a[i]=='e'||a[i]=='i' || a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'){
                a[i]=b.get(j);
                j--;
            }
        }
        String k="";
        for(int i=0;i<s.length();i++){
            k+=a[i];
        }
        return k;
    }
}