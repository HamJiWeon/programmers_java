package level1;

import java.util.*;

public class Q_142086 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> isContain = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            if (isContain.containsKey(cur)) {
                answer[i] = i - isContain.get(cur);
            } else answer[i] = -1;

            isContain.put(cur, i);
        }

        return answer;
    }
}
