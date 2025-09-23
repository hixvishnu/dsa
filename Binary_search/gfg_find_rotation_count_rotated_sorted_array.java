public class gfg_find_rotation_count_rotated_sorted_array {
    public static void main(String[] args){
	int[] nums = {15, 18, 2, 3, 6, 12};
	int count = findRotationCount(nums);
	System.out.println(count);
}

static int findRotationCount(int[] nums){

	if(nums == null || nums.length == 0){
		return -1;
	}
	return findPeak(nums);

}

static int findPeak(int[] nums){
	int start = 0;
	int end = nums.length - 1;
	while(start < end){
		if(nums[start] <= nums[end]){
			return start;
		}
		int mid = start + (end - start) / 2;
		if(nums[mid] > nums[end]){
			start = mid + 1;
		} else{
			end = mid;
		}
	}
	return start;
}
}
