class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        if (n < 4)
            return new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n - 2; j++) {
                int l = j + 1;
                int r = n - 1;
                long req = target - (long) (nums[i] + nums[j]);
                if (j >i+ 1 && nums[j] == nums[j - 1])
                    continue;
                while (l < r) {
                    if ((long) (nums[l] + nums[r]) > req) {
                        r--;
                    } else if ((long) (nums[l] + nums[r]) < req) {
                        l++;
                    } else {
                        list.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l - 1]) {
                            l++;
                        }
                        while (l < r && nums[r] == nums[r + 1]) {
                            r--;
                        }

                    }
                }

            }

        }
        return list;
    }
}