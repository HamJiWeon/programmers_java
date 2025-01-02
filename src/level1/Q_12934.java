package level1;

public class Q_12934 {
    public long solution(long n) {
        if (Math.sqrt(n) == (int) Math.sqrt(n)) return (long) Math.pow((Math.sqrt(n) + 1), 2);
        else return -1;
    }
}
