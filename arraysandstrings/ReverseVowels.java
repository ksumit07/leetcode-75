package arraysandstrings;

import java.util.*;

public class ReverseVowels {
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
        Set<Character> hashSet = new HashSet<>();
        hashSet.add('a');
        hashSet.add('A');
        hashSet.add('e');
        hashSet.add('E');
        hashSet.add('i');
        hashSet.add('I');
        hashSet.add('o');
        hashSet.add('O');
        hashSet.add('u');
        hashSet.add('U');
        return hashSet.contains(ch);
    }

    private static void swap(char[] chArr, int l, int r) {
        char tmp = chArr[l];
        chArr[l] = chArr[r];
        chArr[r] = tmp;
    }
}