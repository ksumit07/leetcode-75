class ReverseVowels {
    public String reverseVowels(String s) {
        char[] chArr = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < r && !isVowel(chArr[l])) {
                l++;
            }
            while (l < r && !isVowel(chArr[r])) {
                r--;
            }
            if (l < r) {
                swap(chArr, l++, r--);
            }
        }
        return new String(chArr);

    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'I' || ch == 'i' || ch == 'o' || ch == 'O'
                || ch == 'U' || ch == 'u';
    }

    private static void swap(char[] chArr, int l, int r) {
        char tmp = chArr[l];
        chArr[l] = chArr[r];
        chArr[r] = tmp;
    }
}