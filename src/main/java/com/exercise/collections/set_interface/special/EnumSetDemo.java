package com.exercise.collections.set_interface.special;

import java.util.EnumSet;

public class EnumSetDemo {
    enum Day{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
    }

    public static void main(String[] args) {
        for (Day d : EnumSet.range(Day.MONDAY, Day.FRIDAY)) {
            System.out.println(d.name());
        }

        EnumSet<Day> dayEnumSet = EnumSet.allOf(Day.class);
        System.out.println("dayEnumSet = " + dayEnumSet);

        EnumSet<Day> likeDay = EnumSet.of(Day.FRIDAY, Day.SATURDAY, Day.SUNDAY);
        System.out.println("likeDay = " + likeDay);

        System.out.println(8 >> 1);
    }
}
