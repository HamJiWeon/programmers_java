package level1;

public class Q_12947 {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        String[] numbers = String.valueOf(x).split("");

        for (String number : numbers) sum += Integer.parseInt(number);
        if (x % sum == 0) return true;
        else return answer;
    }
}
