package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {


    @Test
    public void testReadFileWithName() {
        // given
        SecondChallenge challenge = new SecondChallenge();
        // when & then
        assertAll(
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(2, 1)),
                () -> assertDoesNotThrow(() -> challenge.probablyIWillThrowException(1, 1)),
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(2, 1.5)),
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(1, 1.5)),
                () -> assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(0, 1.5))
        );
    }
}
