package com.kodilla.patterns2.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void bigmacBuilderTest(){
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(" bun with sesame ")
                .burgers(2)
                .sauce("BBQ")
                .ingredient("ham")
                .ingredient("cheese")
                .ingredient("chilli")
                .build();
        System.out.println(bigmac);

        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String howSauce = bigmac.getSauce();

        Assertions.assertEquals(3,howManyIngredients);
        Assertions.assertEquals(2,howManyBurgers);
        Assertions.assertEquals("BBQ",howSauce);
    }
}
