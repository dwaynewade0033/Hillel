package Data;

import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDataApi {

    private static LocalDateTime testDate(DayOfWeek dow){
        return LocalDateTime.now().with(TemporalAdjusters.nextOrSame(dow));
    }
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());

//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.DAY_OF_MONTH, 3);
//        System.out.println(calendar.getTime());
//        System.out.println(calendar.get(Calendar.HOUR));

        Date dateNext = (Date) date.clone();
        dateNext.setTime(100000001);
        System.out.println(date);
        System.out.println(dateNext);

        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        ld= ld.withYear(2000);
        System.out.println(ld);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        String s = ldt.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("uk"));
        System.out.println(s.substring(0,1).toUpperCase()+s.substring(1));
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
        Instant instant = Instant.now();
        System.out.println(instant);

        System.out.println(testDate(DayOfWeek.FRIDAY));

        System.out.println(LocalDateTime.now().withDayOfYear(256));



    }
}
