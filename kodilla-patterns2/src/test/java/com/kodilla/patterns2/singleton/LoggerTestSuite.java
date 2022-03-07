package com.kodilla.patterns2.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LoggerTestSuite {

    private static Logger logger;
    @Test
    void getLastLogTest(){
        logger = Logger.LAST;

        logger.log("Uzytkownik THC");

        Assertions.assertEquals("Uzytkownik THC",logger.getLastLog());
    }
}
