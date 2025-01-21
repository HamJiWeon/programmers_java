package level1;

import java.util.*;

public class Q_176963 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> score = new HashMap<>();

        for (int i = 0; i < name.length; i++) score.put(name[i], yearning[i]);
        System.out.println(score.entrySet());

        for (int i = 0; i < photo.length; i++) {
            int yearningScore = 0;
            for (String s : photo[i]) {
                if (score.containsKey(s)) yearningScore += score.get(s);
                System.out.println(yearningScore);
            }
            answer[i] = yearningScore;
        }

        return answer;
    }
}
