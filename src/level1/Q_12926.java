package level1;

public class Q_12926 {
    public static String solution(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                result.append(ch);
            }

            else if (Character.isUpperCase(ch)) {
                result.append((char) ((ch - 'A' + n) % 26 + 'A'));
            }

            else if (Character.isLowerCase(ch)) {
                result.append((char) ((ch - 'a' + n) % 26 + 'a'));
            }
        }

        return result.toString();
    }
}
