package level1;

public class Q_70128 {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Q_70128 sol = new Q_70128();
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        System.out.println(sol.solution(a, b));
    }
}
