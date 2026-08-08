class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[nums.length -1];
        int gcd = 1;

for (int i = 1; i <= a && i <= b; i++) {
  if (a % i == 0 && b % i == 0) {
    gcd = i;
  }
}
return gcd;
    }
}