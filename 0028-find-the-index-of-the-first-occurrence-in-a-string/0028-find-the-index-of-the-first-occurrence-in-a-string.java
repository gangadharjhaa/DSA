class Solution {
    public int strStr(String haystack, String needle) {
        char[] char1 = haystack.toCharArray();
        char[] char2 = needle.toCharArray();

        for (int i = 0; i <= char1.length - char2.length; i++) {
            int j = 0;

            while (j < char2.length && char1[i + j] == char2[j]) {
                j++;
            }

            if (j == char2.length) {
                return i;
            }
        }

        return -1;
    }
}