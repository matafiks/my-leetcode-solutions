package easy;

import java.time.LocalDate;

public class Problem1185_DayOfTheWeek {

    // this is proper solution using java.time and not some weird calculations required by the task

    public static String dayOfTheWeek(int day, int month, int year) {

        LocalDate localDate = LocalDate.of(year, month, day);

        String dayOfWeek = localDate.getDayOfWeek().toString();
        StringBuilder sb = new StringBuilder();
        String[] conversion = dayOfWeek.split("");
        sb.append(conversion[0]);
        for (int i = 1; i < conversion.length; i++) {
            conversion[i] = conversion[i].toLowerCase();
            sb.append(conversion[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(31,8,2019));
        System.out.println(dayOfTheWeek(17,7,1999));
        System.out.println(dayOfTheWeek(15,8,1993));
    }
}
