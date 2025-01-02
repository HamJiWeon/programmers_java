package level1;

public class Q_12912 {
    public long solution(int a, int b) {
        long answer = 0;

        if (a < b) for (long i = a; i <= b; i++) answer += i;
        else if (a > b) for (long i = b; i <= a; i++) answer += i;
        else answer = a;

        return answer;
    }
}
