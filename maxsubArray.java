class Solution {
    public int maxSubArray(int[] nums) {
        int maxtillhere=0;
        int maxsofar=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            maxtillhere=maxtillhere+nums[i];
            if(maxtillhere<=nums[i])
            {
                maxtillhere=nums[i];
            }
            if(maxsofar<maxtillhere)
            {
                maxsofar=maxtillhere;
            }
        }
        return maxsofar;

    }
}
        
