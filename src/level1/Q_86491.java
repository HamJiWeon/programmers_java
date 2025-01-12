package level1;

public class Q_86491 {
    public int solution(int[][] sizes) {
        int longer = 0, shorter = 0;

        for (int i = 0; i < sizes.length; i++) {
            longer = Math.max(longer, Math.max(sizes[i][0], sizes[i][1]));
            shorter= Math.max(shorter, Math.min(sizes[i][0], sizes[i][1]));
        }


        return longer * shorter;
    }
}
