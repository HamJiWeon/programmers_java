package level2;

import java.util.*;

public class Q_12939 {
    public String solution(String s) {
        int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::valueOf).sorted().toArray();

        return String.valueOf(arr[0]) + " " + String.valueOf(arr[arr.length - 1]);
    }
}
