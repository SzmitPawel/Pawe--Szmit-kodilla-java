package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continent;
    private final List<Country> countryList;

    public Continent(final String continent, final List<Country> countries) {
        this.continent = continent;
        this.countryList = countries;

    }

    public List<Country> getCountries(){
        return new ArrayList<>(countryList);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "countries=" + countryList +
                ", continent='" + continent + '\'' +
                '}';
    }
}
