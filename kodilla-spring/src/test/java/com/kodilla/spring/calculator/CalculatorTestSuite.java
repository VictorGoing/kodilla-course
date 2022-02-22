package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    Calculator calculator;

    @Test
    void testCalculations(){
        Assertions.assertEquals(6.0, calculator.add(4,2));
        Assertions.assertEquals(2.0, calculator.sub(4,2));
        Assertions.assertEquals(8.0, calculator.mul(4,2));
        Assertions.assertEquals(2.0, calculator.div(4,2));
    }
}
