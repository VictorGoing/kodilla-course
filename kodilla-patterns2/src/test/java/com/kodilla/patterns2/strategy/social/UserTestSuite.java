package com.kodilla.patterns2.strategy.social;

import com.kodilla.patterns2.strategy.Customer;
import com.kodilla.patterns2.strategy.IndividualCustomer;
import com.kodilla.patterns2.strategy.predictors.AggressivePredictor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        User Kuba = new ZGeneration("Kuba Rozpruwacz");
        User Kaja = new YGeneration("Kaja Gac");
        User Kacper = new Millenials("Kacper Skibi");

        String kubaPost = Kuba.sharePost();
        System.out.println("Kuba use " + kubaPost);
        String kajaPost = Kaja.sharePost();
        System.out.println("Kaja use " + kajaPost);
        String kacperPost = Kacper.sharePost();
        System.out.println("Kacper use " + kacperPost);

        Assertions.assertEquals("Facebook",kacperPost);
        Assertions.assertEquals("Twitter",kajaPost);
        Assertions.assertEquals("Snapchat", kubaPost);
    }

    @Test
    void testIndividualSharingStrategy(){
        User steven = new ZGeneration("Steven Links");

        //When
        String stevenPost = steven.sharePost();
        System.out.println("Steven use " + stevenPost);
        steven.setSocialPublisher(new TwitterPublisher());
        stevenPost = steven.sharePost();
        System.out.println("Steven now use " + stevenPost);

        //Then
        assertEquals("Twitter", stevenPost);
    }
}
