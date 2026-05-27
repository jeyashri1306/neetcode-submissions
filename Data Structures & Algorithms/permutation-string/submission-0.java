class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
   int[] s1count = new int[26];
   int[] windowcount = new int[26];
   int left=0;

   if(s1.length() > s2.length())return false;

   for(char c : s1.toCharArray()){
    s1count[c-'a']++;
   }

   for(int right=0;right<s2.length();right++){
    windowcount[s2.charAt(right)-'a']++;

    if(right-left+1 > s1.length()){
         windowcount[s2.charAt(left)-'a']--;
         left++;
    }
    if(matches(s1count,windowcount)){
        return true;
    }
   }
   return false;
   
    }
    private boolean matches(int[] a, int[] b){
        for(int i =0; i< 26;i++){
            if(a[i] != b[i]) return false;
        }
        return true;
    }
}
