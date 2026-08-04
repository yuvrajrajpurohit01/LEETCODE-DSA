class Solution {
    public int[] searchRange(int[] nums, int target) {
        int right = nums.length-1;
        int left = 0;
        int[] arr = new int[2];

        int first = -1;
        int last = -1;
        int low = 0, high = nums.length - 1;

while (low <= high) {
    int mid = low + (high - low) / 2;

    if (nums[mid] == target) {
        first = mid;
        high = mid - 1;   // search left half
    } else if (nums[mid] < target) {
        low = mid + 1;
    } else {
        high = mid - 1;
    }
}

low = 0;
high = nums.length - 1;


while (low <= high) {
    int mid = low + (high - low) / 2;

    if (nums[mid] == target) {
        last = mid;
        low = mid + 1;    // search right half
    } else if (nums[mid] < target) {
        low = mid + 1;
    } else {
        high = mid - 1;
    }
}

       arr[0] = first;
       arr[1] = last;
        return arr;
    }
}