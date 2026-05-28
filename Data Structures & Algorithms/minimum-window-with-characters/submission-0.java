class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length())return "";

        int[] tcount = new int[128];
        
        for(char c : t.toCharArray()){
            tcount[c]++;
        }

        int requiredcount = t.length();
        int minlen = Integer.MAX_VALUE;
        int start = 0;
        int left =0;

        for(int right = 0; right <s.length();right++){
            char r = s.charAt(right);
            if(tcount[r] > 0){
                requiredcount--;
            }
            tcount[r]--;
        
        while(requiredcount == 0){
            if(right - left + 1 < minlen){
                minlen = right - left + 1;
                start = left;
            }

            char l = s.charAt(left);
            tcount[l]++;

            if(tcount[l]>0){
                requiredcount++;
            }
            left++;
        }
        }
if(minlen == Integer.MAX_VALUE) return "";

return s.substring(start,start+minlen);

    }
}
