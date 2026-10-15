package dateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime 
{
  public static void main(String[] args) 
  {
	LocalDate n=LocalDate.now();
	System.out.println(n);
	
	
//	change date format
	DateTimeFormatter p=DateTimeFormatter.ofPattern("dd-MM-yyyy");
     String format=n.format(p);
     System.out.println(format);
     
     
//     find current day
     DayOfWeek day=n.getDayOfWeek();
     System.out.println(day);
     
     
     int dayOfmo=n.getDayOfMonth();
     System.out.println(dayOfmo);
   }
}
