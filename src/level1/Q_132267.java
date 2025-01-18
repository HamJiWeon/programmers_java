package level1;

public class Q_132267 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n / a > 0) {
            answer += n / a * b;
            n = n / a * b + n % a;
        }
        return answer;
    }

    public static void main(String[] args) {
        Q_132267 sol = new Q_132267();
        System.out.println(sol.solution(3, 2  , 20));

    }
}
