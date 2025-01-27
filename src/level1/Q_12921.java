package level1;

import java.util.*;

public class Q_12921 {
    public int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime,true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) isPrime[j] = false;
            }
        }
        for (boolean prime : isPrime) if (prime) answer++;

        return answer;
    }

    public static void main(String[] args) {
        Q_12921 sol = new Q_12921();
        int n = 10;
        System.out.println(sol.solution(n));
    }
}
