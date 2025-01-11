package level1;

import java.util.*;
import java.util.stream.IntStream;

public class Q_12982 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int teamMoney : d) {
            if (budget - teamMoney < 0) break;
            else {
                budget -= teamMoney;
                answer++;
            }
        }

        return answer;
    }
}
