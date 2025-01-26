package level1;

public class Q_12901 {
    public String solution(int a, int b) {
        String[][] calendar = {
                {"NULL"},
                {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"}, // 1월
                {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"}, // 2월
                {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"}, // 3월
                {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"}, // 4월
                {"SAT", "SUN", "MON", "TUE", "WED", "THU", "FRI"}, // 5월
                {"TUE", "WED", "THU", "FRI", "SAT", "SUN", "MON"}, // 6월
                {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"}, // 7월
                {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"}, // 8월
                {"WED", "THU", "FRI", "SAT", "SUN", "MON", "TUE"}, // 9월
                {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"}, // 10월
                {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"}, // 11월
                {"WED", "THU", "FRI", "SAT", "SUN", "MON", "TUE"}  // 12월
        };

        return calendar[a][(b % 7)];
    }

    public static void main(String[] args) {
        Q_12901 sol = new Q_12901();
        int a = 2;
        int b = 28;

        System.out.println(sol.solution(a, b));
    }
}
