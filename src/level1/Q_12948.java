package level1;

public class Q_12948 {
    public String solution(String phone_number) {
        // return "*".repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4);
        return phone_number.replaceAll(".(?=.{4})", "*");
    }
}
