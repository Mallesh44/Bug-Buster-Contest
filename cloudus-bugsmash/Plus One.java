class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        digits[i]++;
        while (digits[i] == 10) {
            digits[i] = 0;
            i--;
            if (i < 0) {
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;
                return newDigits;
            }
            digits[i]++;
        }
        return digits;
    }
}
