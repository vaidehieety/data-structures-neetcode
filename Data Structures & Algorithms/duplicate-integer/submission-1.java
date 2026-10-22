
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean duplicate=false;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    duplicate=true;
                    break;
                }
            }

        }

        return duplicate;
    }
}