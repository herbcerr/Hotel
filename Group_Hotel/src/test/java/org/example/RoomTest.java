package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @ParameterizedTest
    @CsvSource({"false, false, true", "false, true, false", "true, false, false", "true, true, false"})
    public void whenCriteriaMet_ReturnsTrue_ElseReturnsFalse(boolean isDirty, boolean isOccupied, boolean expected) {
        boolean isAvailable;

        isAvailable = (!isDirty && !isOccupied) ? true : false;

        assertSame(expected, isAvailable);

    }

}