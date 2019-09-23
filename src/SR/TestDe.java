package SR;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class TestDe {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        Calendar c = Calendar.getInstance();
        d = c.getTime();
        Instant instant = d.toInstant();


        long currentTimeMillis = System.currentTimeMillis();
        long  nanoTime = System.nanoTime();

        System.out.println(new Date(nanoTime));
        c.set(Calendar.HOUR,0);
        c.set(Calendar.MINUTE,0);

        c.clear();
        c.set(Calendar.MILLISECOND,0);
        Instant i = c.toInstant();
        java.sql.Date date3 = new java.sql.Date(new Date().toInstant().toEpochMilli());
        System.out.println(c.getTime());
    }
    static void scheldule (final Date start, Date end){
        Date temp =  (Date) start.clone();
        while (temp.before(end)){
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(temp);
            calendar.add(Calendar.HOUR,1);
            temp = calendar.getTime();
        }
    }
    static void newScheldule(LocalDateTime start, LocalDateTime end){
        for(LocalDateTime ld = start; ld.isBefore(end); ld= ld.plusHours(1)){

        }
    }
}
