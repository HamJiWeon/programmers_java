package level1;

public class Q_12930 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] ch = s.toCharArray();
        int cnt = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                answer.append(ch[i]);
                cnt = 0;
            } else if (cnt % 2 == 0) {
                answer.append(Character.toUpperCase(ch[i]));
                cnt++;
            } else {
                answer.append(Character.toLowerCase(ch[i]));
                cnt++;
            }
        }

        return answer.toString();
    }
}
