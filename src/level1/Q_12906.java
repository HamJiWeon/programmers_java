package level1;

import java.util.*;

public class Q_12906 {
    public int[] solution(int []arr) {
        List<Integer> answer = new LinkedList<>();

        int temp = -1;
        for (int x : arr) {
            if (x != temp) {
                answer.add(x);
                temp = x;
            }
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
