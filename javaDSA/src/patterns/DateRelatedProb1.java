package patterns;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.DayOfWeek;

public class DateRelatedProb1 {
public static void main(String args[]) {
	
LocalDate today=LocalDate.now();
	LocalDate futureDay=today.plusDays(500);
	DayOfWeek day=futureDay.getDayOfWeek();
	
	System.out.println("today is: "+today);
	System.out.println("future Date is: "+futureDay);
	System.out.println("future Day of week is: "+day);

	
}
}
