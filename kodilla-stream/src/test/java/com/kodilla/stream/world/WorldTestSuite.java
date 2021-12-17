package com.kodilla.stream.world;

import com.kodilla.stream.sand.Asia;
import com.kodilla.stream.sand.Europe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Asia
        List<Country> asia = new ArrayList<>();
        asia.add(new Country(new BigDecimal("10000000")));
        asia.add(new Country(new BigDecimal("10000000")));
        asia.add(new Country(new BigDecimal("10000000")));
        //Africa
        List<Country> africa = new ArrayList<>();
        asia.add(new Country(new BigDecimal("10000000")));
        asia.add(new Country(new BigDecimal("10000000")));
        asia.add(new Country(new BigDecimal("10000000")));
        //Europe
        List<Country> europe = new ArrayList<>();
        asia.add(new Country(new BigDecimal("10000000")));
        asia.add(new Country(new BigDecimal("10000000")));
        asia.add(new Country(new BigDecimal("10000000")));

        List<Continent> continentList = new ArrayList<>();
        continentList.add(new Continent(asia));
        continentList.add(new Continent(africa));
        continentList.add(new Continent(europe));

        World world = new World(continentList);


        Assertions.assertEquals(BigDecimal.valueOf(90000000),world.getPeopleQuantity());
    }
}
