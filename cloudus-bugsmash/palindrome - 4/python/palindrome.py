def expandAroundCenter(s, left, right):
    while left >= 0 and right < len(s) and s[left] == s[right]:
        left += 1
        right -= 1
    return right - left

def longestPalindromeSubstring(s):
    if not s:
        return None

    start = 0
    maxLength = 1

    for i in range(len(s) + 1):
        len1 = expandAroundCenter(s, i, i)
        len2 = expandAroundCenter(s, i, i + 1)
        maxLen = len2 if len1 > len2 else len1

        if maxLen >= maxLength:
            start = i - maxLen // 2
            maxLength = maxLen

    return s[start:start + maxLength + 1]

print(longestPalindromeSubstring("babad"))
print(longestPalindromeSubstring("cbbd"))
print(longestPalindromeSubstring(""))
print(longestPalindromeSubstring("a"))
print(longestPalindromeSubstring("racecar"))
