package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReturnNameOfDayOfWeekTest {

    @Test
    void returnNameOfDayOfWeek() {
        //given
        int monday = 1;
        int error = 8;
        //when
        String mondayExpected = Main.returnNameOfDayOfWeek(monday);
        String errorExpected = Main.returnNameOfDayOfWeek(error);
        //then
        Assertions.assertEquals(mondayExpected, "Monday");
        Assertions.assertEquals(errorExpected, "There is no such a day!");

    }
}