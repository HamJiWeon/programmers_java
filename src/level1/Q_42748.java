package level1;

import java.util.*;

public class Q_42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;

            int[] findArray = Arrays.copyOfRange(array, start, end);
            Arrays.sort(findArray);

            answer[i] = findArray[k];
        }

        return answer;
    }

    public static void main(String[] args) {
        Q_42748 sol = new Q_42748();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(sol.solution(array, command)));
    }
}
