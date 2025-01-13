package level1;

import java.util.*;

public class Q_81301 {
    public int solution(String s) {

        HashMap<String, String> number = new HashMap<>();
        number.put("1", "one");
        number.put("2", "two");
        number.put("3", "three");
        number.put("4", "four");
        number.put("5", "five");
        number.put("6", "six");
        number.put("7", "seven");
        number.put("8", "eight");
        number.put("9", "nine");

        for (String key : number.keySet()) {
            s = s.replaceAll(key, number.get(key));
        }

        return Integer.parseInt(s);
    }
}
