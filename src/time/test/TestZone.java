package time.test;

import java.time.*;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 0), ZoneId.of("Asia/Seoul"));
        ZonedDateTime rondon = nowZdt.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newYork = nowZdt.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("한국의 회의 시간: " + nowZdt);
        System.out.println("런던의 회의 시간: " + rondon);
        System.out.println("뉴욕의 회의 시간: " + newYork);
    }
}
