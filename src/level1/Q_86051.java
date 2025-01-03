package level1;

public class Q_86051 {
    public int solution(int[] numbers) {
        int answer = 45;
        int[] numArr = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }

        return answer;
    }
}
