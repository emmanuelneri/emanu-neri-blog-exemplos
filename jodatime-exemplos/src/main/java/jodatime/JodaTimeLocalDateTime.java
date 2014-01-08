package jodatime;

import org.joda.time.LocalDateTime;

import java.util.Locale;

public class JodaTimeLocalDateTime {

	private LocalDateTime localDateTime;

	public JodaTimeLocalDateTime() {
		localDateTime = new LocalDateTime(2014, 10, 20, 15, 30, 15);
	}

	private void apresentacao() {
		System.out.println(localDateTime.getYear()); // 2014
		System.out.println(localDateTime.getMonthOfYear()); //10
		System.out.println(localDateTime.getDayOfMonth()); //20
		System.out.println(localDateTime.getHourOfDay()); //15
		System.out.println(localDateTime.getMinuteOfHour()); //30
		System.out.println(localDateTime.getSecondOfMinute()); //15
	}

	private void formatacao() {
		System.out.println(localDateTime.toString("dd/MM/yyyy hh:mm:ss", new Locale("pt_BR")));  //20/10/2014 03:30:15
	}
}
