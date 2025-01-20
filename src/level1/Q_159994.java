package level1;

import java.util.*;

public class Q_159994 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Deque<String> deque1 = new ArrayDeque<>();
        Deque<String> deque2 = new ArrayDeque<>();
        deque1.addAll(List.of(cards1));
        deque2.addAll(List.of(cards2));

        for (String wantedWord : goal) {
            if (wantedWord.equals(deque1.peek())) {
                deque1.poll();
            } else if (wantedWord.equals(deque2.peek())) {
                deque2.poll();
            } else return "No";
        }
        //if (deque1.isEmpty() && deque2.isEmpty()) return "Yes";

        return answer;
    }
}
