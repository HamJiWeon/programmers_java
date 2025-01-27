package level1;

import java.util.*;

public class Q_135808 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length - m; i >= 0; i -= m)
            answer += score[i] * m;

        return answer;
    }

    public static void main(String[] args) {
        Q_135808 sol = new Q_135808();
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};

        System.out.println(sol.solution(k, m, score));
    }
}
