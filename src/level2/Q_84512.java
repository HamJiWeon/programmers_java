package level2;

import java.util.*;

public class Q_84512 {
    public int solution(String word) {
        int answer = 0;
        char[] words = {'A', 'E', 'I', 'O', 'U'};
        int[] page = {781, 156, 31, 6, 1};

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int idx = Arrays.binarySearch(words, c);

            answer += idx * page[i] + 1;
        }

        return answer;
    }
}
