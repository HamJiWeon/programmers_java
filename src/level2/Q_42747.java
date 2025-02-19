package level2;

import java.util.*;

public class Q_42747 {
    public int solution(int[] citations) {
        int answer = 1;

        Arrays.sort(citations);

        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] >= answer) answer++;
            else return answer - 1;
        }

        return answer - 1;
    }
}
