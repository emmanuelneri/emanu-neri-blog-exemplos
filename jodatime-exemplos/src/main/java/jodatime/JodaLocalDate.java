package jodatime;

import org.joda.time.LocalDate;

import java.util.Locale;

public class JodaLocalDate {

	private LocalDate localDate;

	public JodaLocalDate() {
		localDate = new LocalDate(2012, 3, 1);
	}

	private void apresentacao() {
		System.out.println(localDate.getYear());   // 2012
		System.out.println(localDate.getDayOfMonth()); //1
		System.out.println(localDate.getMonthOfYear()); //3
	}

	private void formatacao() {
		System.out.println(localDate.toString("dd/MM/YY", new Locale("pt_BR")));  //01/03/12
		System.out.println(localDate.toString("dd/MMM/YYYY", new Locale("pt_BR"))); //01/Mar/2012
	}

}
