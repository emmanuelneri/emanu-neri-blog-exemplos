package jodatime;

import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.joda.time.YearMonth;

import java.util.Date;

public class JodaYearMonth {

	private YearMonth yearMonthAtual;
	private YearMonth yearMonthJaneiro2014;

	public JodaYearMonth() {
		this.yearMonthAtual = YearMonth.now();  // 2014 - 01
		this.yearMonthJaneiro2014 = new YearMonth(2014, 1); // dia pode ser 1 ou 01

		YearMonth yearMonthFromDate = new YearMonth().fromDateFields(new Date());
	}

	private void adicionar() {
		this.yearMonthAtual.plusYears(1); // adiciona 1 ano
		this.yearMonthAtual.plusMonths(3); // adiciona 3 meses
	}

	private void remover() {
		this.yearMonthAtual.minusYears(2); // diminui 2 anos
		this.yearMonthAtual.minusMonths(5); // diminui 5 meses
	}

	private void apresentacao() {
		System.out.println(this.yearMonthJaneiro2014); // 2014-01
		System.out.println(this.yearMonthJaneiro2014.getYear()); // 2014
		System.out.println(this.yearMonthJaneiro2014.getMonthOfYear()); // 1
	}

	private void yearMonthToLocalDate() {
		YearMonth yearMonth = new YearMonth(2014, 1);

		LocalDate dataInicial = yearMonth.toLocalDate(1);
		LocalDate dataFinal = dataInicial.dayOfMonth().withMaximumValue();

		System.out.println(dataInicial);  //2014-01-01
		System.out.println(dataFinal);  //2014-01-31
	}


	public static void main(String args[]) {
//		try {
//			System.out.println(new YearMonth(32132131).toString("yyyy/MM"));
//		} catch (Exception e) {
//			System.out.println("format");
//		}
//
//
//
//		try {
//			new YearMonth(12, 2332);
//		}  catch (IllegalFieldValueException e) {
//			System.out.println("catch");
//		}

//		YearMonth yearMonth = new YearMonth(2014, 3);
//
//			if(yearMonth.getMonthOfYear() >= 4 && yearMonth.getMonthOfYear() <= 12) {
//				System.out.println(yearMonth.getYear() +"/"+yearMonth.plusYears(1).getYear());
//			} else {
//				System.out.println(yearMonth.minusYears(1).getYear() +"/"+ yearMonth.getYear());
//			}


		System.out.println(SACIII.valueOf("x"));

	}
}

enum SACIII {
	A,
	B;
}
