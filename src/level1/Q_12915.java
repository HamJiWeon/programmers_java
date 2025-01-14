package level1;

import java.util.*;

public class Q_12915 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            if (a.charAt(n) != b.charAt(n)) {
                return a.charAt(n) - b.charAt(n);
            }

            return a.compareTo(b);
        });

        return strings;
    }
}
