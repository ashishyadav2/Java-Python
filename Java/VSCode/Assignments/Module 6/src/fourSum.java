public class fourSum {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2}
		int target = 8;
    }
	static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, target, 0, 4);
    }
    static List<List<Integer>> kSum(int[] nums,long target,int k,int start) {
		List<List<Integer>> res = new ArrayList<>();
        if(start==nums.length) {
			return res;
		}
		long avg_val = target/k;
		if(nums[start]>avg_val || avg_val < nums[nums.length-1]) {
			return res;
		}
		if(k==2) {
			twoSum(start,target,nums);
		}
		for(int i=start;i<nums.length;i++) {
			if(i=start||nums[i-1]!=nums[i]) {
				for(List<Integer> subset : kSum(nums,target,k-1,i+1)) {
					res.add(new ArrayList<>(Arrays.asList(nums[i])));
					res.get(res.size()-1).addAll(subset);
				}
			}
		}
		return res;
    }
    static List<Integer> twoSum(int start,long target,int[] nums) {
        List<Integer> res = new ArrayList<Integer>;
        int lo = start;
        int hi = nums.length-1;
		int currSum = nums[lo]+nums[hi];
		if(currSum<target || (lo>start && nums[lo] == nums[lo-1]) {
			++lo;
		}
		else if(currSum>target || (hi<nums.length && nums[hi] == nums[hi+1]) {
			--hi;
		}
		else {
			res.add(Arrays.asList(nums[lo++],nums[hi--]);
		}
		return res;
    }
}
