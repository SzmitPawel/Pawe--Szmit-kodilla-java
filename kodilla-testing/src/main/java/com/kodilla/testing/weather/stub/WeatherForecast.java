package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {

        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double averageTemperature() {

        double average = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            average += temperature.getValue();
        }

        return average / temperatures.getTemperatures().size();
    }

    public double medianOfTemperature(){

        ArrayList <Double> medianTemperatures = new ArrayList<>();

        Double median = 0.0;

        // copies values from HashMap to ArrayList for sorting
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            medianTemperatures.add(temperature.getValue());
        }

        Collections.sort(medianTemperatures);

        // calculating a middle of ArrayList
        if (medianTemperatures.size() % 2 == 0) {
            median = medianTemperatures.get((medianTemperatures.size() - 1) / 2);
        } else {
            median = (medianTemperatures.get((medianTemperatures.size() - 1) / 2) + medianTemperatures.get(medianTemperatures.size() / 2)) / 2;
        }

        return median;
    }
}
