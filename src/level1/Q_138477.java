package level1;

import java.util.*;

public class Q_138477 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pQ = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            pQ.offer(score[i]);
            if (pQ.size() > k) pQ.poll();
            answer[i] = pQ.peek();
        }

        return answer;
    }
}
