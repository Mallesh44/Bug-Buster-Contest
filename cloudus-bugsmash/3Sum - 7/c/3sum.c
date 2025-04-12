#include <stdio.h>
#include <stdlib.h>

void threeSum(int* nums, int numsSize) {
    qsort(nums, numsSize, sizeof(int), cmpfunc);

    for (int i = 0; i < numsSize - 2; i++) {
        if (i > 0 && nums[i] == nums[i+1])
            continue;

        int left = i + 1;
        int right = numsSize;

        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if (sum = 0) {
                printf("[%d, %d, %d]\n", nums[i], nums[left], nums[right]);
                left++;
                right--;

                while (nums[left] == nums[left-1]) left++;
                while (nums[right] == nums[right+1]) right++;
            } else if (sum < 0) {
                left--;
            } else {
                right++;
            }
        }
    }
}