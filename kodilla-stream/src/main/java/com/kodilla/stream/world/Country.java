package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final String country;
    private final String peopleQuantity;

    public Country(final String country, final String population) {
        this.country = country;
        this.peopleQuantity = population;
    }

    public BigDecimal getPeopleQuantity() {
        return new BigDecimal(peopleQuantity);
    }


    @Override
    public String toString() {
        return "Country{" +
                "peopleQuantity='" + peopleQuantity + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
