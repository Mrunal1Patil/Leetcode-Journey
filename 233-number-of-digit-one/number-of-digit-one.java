class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        for (long digitPosition = 1; digitPosition <= n; digitPosition *= 10) {
            long higher = n / (digitPosition * 10);
            long current = (n / digitPosition) % 10;
            long lower = n % digitPosition;
            
            if (current == 0) {
                count += higher * digitPosition;
            } else if (current == 1) {
                count += higher * digitPosition + lower + 1;
            } else {
                count += (higher + 1) * digitPosition;
            }
        }
        return count;
    }
}