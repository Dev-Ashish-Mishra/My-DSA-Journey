class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;
        // Step 1: Find Pivot
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) 
            {
                pivot = i;
                break;
            }
            }
        // If no pivot found, array is in descending order
            if (pivot == -1)
            {
            int left = 0;
            int right = n - 1;
            while (left < right) 
            {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
            }
            return;
            }
        // Step 2: Find next greater element from right
        for (int i = n - 1; i > pivot; i--)
        {
            if (nums[i] > nums[pivot]) 
            {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }
        // Step 3: Reverse from pivot+1 to end manually
        int left = pivot + 1;
        int right = n - 1;
        while (left < right)
        {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
    }
}
}