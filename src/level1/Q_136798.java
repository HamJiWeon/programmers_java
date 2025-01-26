package level1;

public class Q_136798 {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int div = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    div++;
                    if (j != i / j) div++;
                }
            }
            if (div <= limit) answer += div;
            else answer += power;
        }

        return answer;
    }

    public static void main(String[] args) {
        Q_136798 sol = new Q_136798();
        int number = 5;
        int limit = 3;
        int power = 2;
        System.out.println(sol.solution(number, limit, power));
    }
}
