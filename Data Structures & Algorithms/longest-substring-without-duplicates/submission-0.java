class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        //set={} because no duplicates

        int left = 0;
        int maxlength = 0;
// if duplictae found like set={xyz} and another z comes we remove it and then add the 

        for(int right = 0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
        //add current upcoming value
            set.add(s.charAt(right));
            maxlength = Math.max(maxlength,right-left + 1); 
        }
        return maxlength;
    }
}
