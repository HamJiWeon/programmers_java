package level1;

public class Q_131705 {
    private static int answer = 0;
    public int solution(int[] number) {
        answer = 0;
        DFS(number, 0, 0, 0);

        return answer;
    }

    private void DFS(int[] number, int trio, int start, int sum) {
        if (trio == 3) {
            if (sum == 0) answer++;
        }

        for (int i = start; i < number.length; i++) {
            DFS(number, trio + 1, i + 1, sum + number[i]);
        }
    }

    public static void main(String[] args) {
        Q_131705 sol = new Q_131705();
        int[] number = {-2, 3, 0, 2, -5};

        System.out.println(sol.solution(number));
    }
}
