package com.crazykid.junior;

import java.util.Calendar;

public class LeapYearGenerator {
    private Calendar mCalendar = Calendar.getInstance();

    public Integer[] generate(int factor) {
        handleException(factor);
        return generateLeapYears(factor);
    }

    private void handleException(int factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("The factor must be positive");
        }
    }

    private Integer[] generateLeapYears(int factor) {
        int index = 0;
        Integer[] nextLeapYears = new Integer[factor];
        int thisYear = mCalendar.get(Calendar.YEAR);
        for (int i=0; index < 20; i++) {
            if (isLeapYear(thisYear + i)) {
                nextLeapYears[index++] = thisYear + i;
            }
        }
        return nextLeapYears;
    }

    private boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            return year % 400 == 0;
        } else {
            return year % 4 ==0;
        }
    }
}
