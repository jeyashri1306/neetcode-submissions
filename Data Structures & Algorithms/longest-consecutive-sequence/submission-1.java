class Solution {
    public int longestConsecutive(int[] nums) {
int n = nums.length;

Arrays.sort(nums);
int longest = 1;
int current = 1;
if(nums.length == 0)return 0;

for(int i =1;i<n;i++){
    if(nums[i] == nums[i-1])continue;


    if(nums[i] == nums[i-1]+1){
        current++;
    }else{
        current = 1;
    }
    longest = Math.max(longest,current);
    }
return longest;
}
    }

