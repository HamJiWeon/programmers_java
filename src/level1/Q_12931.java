package level1;

import java.util.*;

public class Q_12931 {
    public int solution(int n) {
        int answer = 0;
        String num = String.valueOf(n);
        String[] splitNum = num.split("");
        for (String x : splitNum) {
            answer += Integer.parseInt(x);
        }

        return answer;
    }
}
