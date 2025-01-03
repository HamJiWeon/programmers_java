package level1;

import java.util.*;

public class Q_12910 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new LinkedList<>();

        for (int x : arr) if (x % divisor == 0) list.add(x);
        if (list.isEmpty()) list.add(-1);

        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}