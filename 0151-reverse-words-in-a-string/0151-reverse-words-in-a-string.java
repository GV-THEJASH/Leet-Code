class Solution {
    public String reverseWords(String s) {
        String[] w = s.trim().split("\\s+");
        int f = 0;
        int r = w.length - 1;
        while (f < r) {
            String k = w[f];
            w[f] = w[r];
            w[r] = k;
            r--;
            f++;
        }
        return String.join(" ", w);
    }
}
