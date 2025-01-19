package level1;

import java.util.*;

public class Q_17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);

            while (binary.length() < n) binary = "0" + binary;

            answer[i] = binary.replace("1", "#").replace("0", " ");
        }

        return answer;
    }
}
