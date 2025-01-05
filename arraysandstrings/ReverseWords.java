package arraysandstrings;

public class ReverseWords {
    public String reverseWords(String s) {
        s = s.trim();
        int end = s.length() - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            end = i;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            String word = s.substring(i + 1, end + 1);
            if (word.equals("")) {
                continue;
            }
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }
}
