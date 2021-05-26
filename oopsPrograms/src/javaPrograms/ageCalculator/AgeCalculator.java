package javaPrograms.ageCalculator;

import java.time.LocalDate;

import java.time.Month;
import java.time.temporal.ChronoUnit;

public class AgeCalculator {
	public static void main(String[] args) {

		LocalDate startDate = LocalDate.of(2002, Month.AUGUST, 15);

		LocalDate endDate = LocalDate.of(2021, Month.MAY, 23);

		double numberOfYears = ChronoUnit.MONTHS.between(startDate, endDate);

		double temp = numberOfYears / 12;
		System.out.println(temp);

	}
}
