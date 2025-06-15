package easy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Problem1154_DayOfTheYear {

    public static int dayOfYear(String date) {

        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        return localDate.getDayOfYear();
    }

    public static void main(String[] args) {
        System.out.println(dayOfYear("2019-01-09"));
        System.out.println(dayOfYear("2019-02-10"));
    }
}
