class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] count = new int[1001];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                count[nums[i + 1]]++;
            }
        }
        int ans = 0;
        for (int i = 1; i <= 1000; i++) {
            if (count[i] > count[ans]) {
                ans = i;
            }
        }

        return ans;
    }
}