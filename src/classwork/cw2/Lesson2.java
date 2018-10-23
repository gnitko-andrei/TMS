package classwork.cw2;

import java.io.PrintStream;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Lesson2 {
    public Lesson2() {
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(time);
        System.out.println(dateTime);
        if (date.getDayOfWeek() != DayOfWeek.MONDAY && date.getDayOfWeek() != DayOfWeek.WEDNESDAY) {
            System.out.println("Relax");
        } else {
            System.out.println("Java days");
            System.out.println(date);
            PrintStream var10000 = System.out;
            date.getDayOfMonth();
            date.getMonth();
            date.getYear();
        }

        switch (date.getDayOfWeek()) {
            case MONDAY:
            case WEDNESDAY:
                System.out.println("Java day");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Yahoo");
                break;
            default:
                System.out.println("Working day");
        }

    }
}
