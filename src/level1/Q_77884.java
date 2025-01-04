package level1;

import java.util.stream.IntStream;

public class Q_77884 {
    public int solution(int left, int right) {
        return IntStream.rangeClosed(left, right)
                .map(number -> {
                    int answer = (int) IntStream.rangeClosed(1, number)
                            .filter(i -> number % i == 0).count();
                    return answer % 2 == 0 ? number : -number;
                })
                .sum();
    }
}
