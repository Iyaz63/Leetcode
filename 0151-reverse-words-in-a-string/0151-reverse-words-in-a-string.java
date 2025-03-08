class Solution {
    public String reverseWords(String s) {
        String [] a=s.trim().split("\\s+");
        String b="";
        for(int i=a.length-1;i>=0;i--){
            if(i==0){
                b+=a[i];
                break;
            }
            b+=a[i]+" ";
        }
        return b;
    }
}