def three_sum(nums):
    nums.sort()
    result = set()

    for i in range(len(nums) - 2):
        if i > 0 and nums[i] == nums[i+1]:
            continue
        left = i - 1
        right = len(nums) - 1

        while left < right:
            total = nums[i] + nums[left] + nums[right]
            if total == 0:
                result.add((nums[i], nums[left], nums[right]))
                left =+ 1
                right = right - 1
            elif total < 0:
                left += 1
            else
                right -= 1

    return list(results)