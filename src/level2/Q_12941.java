package level2;

import java.util.*;

class Q_12941 {
    public int solution(int[] A, int[] B) {
        int answer = 0, idx = B.length - 1;
        Arrays.sort(A);
        Arrays.sort(B);

        for (int x : A) {
            answer += x * B[idx];
            idx--;
        }

        return answer;
    }
}