package com.kodilla.stream.world;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    private static List<Country> europeCountries = new ArrayList<>();
    private static List<Country> asiaCountries = new ArrayList<>();
    private static List<Country> africaCountries = new ArrayList<>();

    private static Continent europe;
    private static Continent asia;
    private static Continent africa;

    @BeforeAll
    public static void beforeAll (){
        // prepare list of continents with countries and population
        // creating Europe counties
        europeCountries.add(new Country("Poland", "38179800"));
        europeCountries.add(new Country("Germany", "82186000"));
        europeCountries.add(new Country("France", "63713926"));
        europeCountries.add(new Country("Italy", "59619290"));
        europeCountries.add(new Country("Spain", "40499799"));

        // creating Asia counties
        asiaCountries.add(new Country("China", "11343239923"));
        asiaCountries.add(new Country("Japan", "126146350"));
        asiaCountries.add(new Country("India", "1326801576"));
        asiaCountries.add(new Country("Pakistan", "215824000"));
        asiaCountries.add(new Country("South Korea", "52117000"));

        // creating Africa counties
        africaCountries.add(new Country("Nigeria", "218717804"));
        africaCountries.add(new Country("Egypt", "107085039"));
        africaCountries.add(new Country("Ethiopia", "121974184"));
        africaCountries.add(new Country("Congo", "96266323"));
        africaCountries.add(new Country("Angola", "35383893"));

        // creating continents
        europe = new Continent("Europe", europeCountries);
        asia = new Continent("Asia", asiaCountries);
        africa = new Continent("Africa", africaCountries);

    }

    @Test
    public void testGetWorldPeopleQuantity(){

        // given
        World world = new World();

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        BigDecimal expectedResult = new BigDecimal("13927754907");

        // when
        BigDecimal result = world.getPeopleQuantity();

        // then
        assertEquals(expectedResult,result);
    }
}