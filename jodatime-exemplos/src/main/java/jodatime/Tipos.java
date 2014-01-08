package jodatime;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.joda.time.YearMonth;

public class Tipos {

	private static LocalDate localDate = LocalDate.now();
	private static LocalTime localTime = LocalTime.now();
	private static DateTime dateTime = DateTime.now();

	private static YearMonth yearMonth = YearMonth.now();

	private static Days days = Days.FIVE;
	private static Hours hours = Hours.FIVE;

	private static Period period = Period.years(2);
	private static Duration duration = Duration.millis(1000);
//	private static Interval interval = Interval.parse("1000");

    public static void main(String[] args) {
        System.out.println("localDate : " + localDate );
        System.out.println("localTime : " + localTime );
        System.out.println("dateTime : " + dateTime );
        System.out.println("yearMonth : " + yearMonth );
        System.out.println("days : " + days );
        System.out.println("hours : " + hours );
        System.out.println("period : " + period );
        System.out.println("duration : " + duration );
//        System.out.println("interval : " + interval );
    }
}
