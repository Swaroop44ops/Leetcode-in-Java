class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> diff=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(diff.contains(nums[i])){
                return true;
            }
            diff.add(nums[i]);
        }
        return false;

    }
}