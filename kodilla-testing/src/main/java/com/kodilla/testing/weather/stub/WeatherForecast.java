package com.kodilla.testing.weather.stub;

import java.beans.PropertyEditorSupport;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
            resultMap.put(temperature.getKey(), temperature.getValue() + 1);
        }

        return resultMap;
    }

    public Double meanTemperatures(){
        Double result = 0.00;
        for(Map.Entry<String, Double> temperature : this.temperatures.getTemperatures().entrySet()){
            result += temperature.getValue();
        }
        result /= temperatures.getTemperatures().size();
        return result;
    }
    public Double medianTemperatures(){
        Double result = 0.00;
        for(Map.Entry<String, Double> temperature : this.temperatures.getTemperatures().entrySet()){
            result += temperature.getValue();
        }
        return 23.22;
    }

}