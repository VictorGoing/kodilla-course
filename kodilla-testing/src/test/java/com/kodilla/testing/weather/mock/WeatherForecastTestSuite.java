package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testMeanTemperaturesWithMock() {

        Double a = 21.03;
        Double b = 23.43;
        Double c = 25.42;
        Double d = 21.92;
        Double e = 23.22;
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", a);
        temperaturesMap.put("Krakow", b);
        temperaturesMap.put("Wroclaw", c);
        temperaturesMap.put("Warszawa", d);
        temperaturesMap.put("Gdansk", e);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);




        Assertions.assertEquals(23.00, weatherForecast.meanTemperatures(),0.01);
    }

    @Test
    void testMedianTemperaturesWithMock1() {

        Double a = 21.03;
        Double b = 23.43;
        Double c = 25.42;
        Double d = 21.92;
        Double e = 23.22;
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", a);
        temperaturesMap.put("Krakow", b);
        temperaturesMap.put("Wroclaw", c);
        temperaturesMap.put("Warszawa", d);
        temperaturesMap.put("Gdansk", e);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);




        Assertions.assertEquals(23.22 ,weatherForecast.medianTemperatures());
    }

    @Test
    void testMedianTemperaturesWithMock2() {

        Double a = 21.03;
        Double b = 23.43;
        Double c = 25.42;
        Double d = 21.92;
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", a);
        temperaturesMap.put("Krakow", b);
        temperaturesMap.put("Wroclaw", c);
        temperaturesMap.put("Warszawa", d);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);




        Assertions.assertEquals(22.67 ,weatherForecast.medianTemperatures(),0.01);
    }
}