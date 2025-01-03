package level1;

import java.util.Arrays;

public class Q_12935 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        int min = Arrays.stream(arr).min().getAsInt();

        return Arrays.stream(arr).filter(num -> num != min).toArray();
    }
}
