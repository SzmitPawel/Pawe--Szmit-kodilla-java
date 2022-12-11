package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

        private static int counter = 0;
        @Mock
        private static Temperatures temperatures;
        private static Map<String, Double> temperaturesMap = new HashMap<>();

        @BeforeAll
        public static void beforeAll(){

            temperaturesMap.put("Rzeszow", 25.5);
            temperaturesMap.put("Krakow", 26.2);
            temperaturesMap.put("Wroclaw", 24.8);
            temperaturesMap.put("Warszawa", 25.2);
            temperaturesMap.put("Gdansk", 26.1);

            System.out.println("This is the beginning of tests");

        }

        @AfterAll
        public static void afterAll(){
            System.out.println("This is the end of tests");
        }

        @BeforeEach
        public void beforeEach(){
            counter++;
            System.out.println("Preparing to execute of test #" + counter);
        }

        @DisplayName("when create weatherForecast " +
                     "then calculateForecast should return Map of temperatures")
        @Test
        void testCalculateForecastWithMock() {
            //Given
            when(temperatures.getTemperatures()).thenReturn(temperaturesMap);

            WeatherForecast weatherForecast = new WeatherForecast(temperatures);

            //When
            int quantityOfSensors = weatherForecast.calculateForecast().size();

            //Then
            assertEquals(5, quantityOfSensors);
        }

        @DisplayName("when create weatherForecast " +
                     "then averageTemperature should return average of temperatures")
        @Test
        void testCaseAverageTemperature(){
            // given
            when(temperatures.getTemperatures()).thenReturn(temperaturesMap);

            WeatherForecast weatherForecast = new WeatherForecast(temperatures);
            double expectedResult = 25.56;

            // when
            double averageTemperature = weatherForecast.averageTemperature();

            // then
            assertEquals(expectedResult,averageTemperature);
        }

        @DisplayName("when created weatherForecast " +
                     "then medianOfTemperature should return median of Temperature")
        @Test
        void testCaseMedianOfTemperature(){
            // given
            when(temperatures.getTemperatures()).thenReturn(temperaturesMap);

            WeatherForecast weatherForecast = new WeatherForecast(temperatures);

            double expectedResult = 25.5;

            // when
            double medianOfTemperature = weatherForecast.medianOfTemperature();

            // then
            assertEquals(expectedResult, medianOfTemperature);
        }
}

