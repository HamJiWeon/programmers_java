package level1;

public class Q_12916 {
    boolean solution(String s) {
        int p = 0, y = 0;

        char[] str = s.toLowerCase().toCharArray();
        for (char x : str) {
            if (x == 'p') p++;
            else if (x == 'y') y++;
        }
        return p == y;
    }
}
