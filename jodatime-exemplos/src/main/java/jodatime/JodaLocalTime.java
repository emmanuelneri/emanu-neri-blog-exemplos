package jodatime;

import org.joda.time.LocalTime;

import java.util.Locale;

public class JodaLocalTime {

	private LocalTime localTime;

	public JodaLocalTime() {
		localTime = new LocalTime(20, 30, 15);
	}

	private void apresentacao() {
		System.out.println(localTime.getHourOfDay());   // 20
		System.out.println(localTime.getMinuteOfHour()); //30
		System.out.println(localTime.getSecondOfMinute()); //15
	}

	private void formatacao() {
		System.out.println(localTime.toString("hh:mm:ss", new Locale("pt_BR"))); //08:30:15
	}
}
