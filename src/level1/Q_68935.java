package level1;

public class Q_68935 {
    public int solution(int n) {
        String num = Integer.toString(n, 3);
        String reverse = new StringBuilder(num).reverse().toString();

        return Integer.parseInt(reverse, 3);
    }
}
