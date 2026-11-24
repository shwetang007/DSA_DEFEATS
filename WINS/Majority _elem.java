//via hashing 


class Solution {
    public int majorityElement(int[] nums) {
        ///pehle add kro ; fir ek ur loop se check kro ki hai ki nhi agar hai toh cnt++ krdo last me ct>n/2 toh return kro
        int maj=nums.length/2;
         HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.containsKey(nums[i])){
                if(map.get(nums[i])>nums.length/2){
                       return nums[i];
                }
            }
        }
           return 0;
    }
}
