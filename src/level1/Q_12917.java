package level1;

import java.util.Arrays;

public class Q_12917 {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        return new StringBuilder(new String(arr)).reverse().toString();
    }
}
