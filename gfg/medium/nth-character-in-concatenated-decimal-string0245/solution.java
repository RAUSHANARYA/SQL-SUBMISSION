class Solution {
    public char nthCharacter(int n) {
        long digits = 9;
        long start = 1;
        long length = 1;

        // Find which group of numbers contains the nth character
        while (n > digits * length) {
            n -= digits * length;
            digits *= 10;
            start *= 10;
            length++;
        }

        // Find the number containing the character
        long number = start + (n - 1) / length;

        // Find the digit inside that number
        int index = (int) ((n - 1) % length);

        return Long.toString(number).charAt(index);
    }
}