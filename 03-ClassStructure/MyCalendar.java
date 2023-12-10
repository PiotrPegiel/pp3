import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MyCalendar {
    private static int year = 2023;
    private static int month = 3;
    private static int day = 9;

    public static String myDate(){
        return String.format("",year,month,day);
    }

    public static long days(){
        LocalDate beginning = LocalDate.of(year,1,1);
        LocalDate now = LocalDate.of(year,month,day);
        return ChronoUnit.DAYS.between(beginning, now);
    }

    //public static String monthName(){}
}

class during6{
    public static void main(String[] args) {
        System.out.println(MyCalendar.myDate());
        System.out.println(MyCalendar.days());
    }
}