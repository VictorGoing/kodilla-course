package com.kodilla.testing.weather.stub;

import java.beans.PropertyEditorSupport;
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
        Double result = 0.00; //parzyście nieparzyście i posortować(collection.sorted)
        List<Double> list = new LinkedList<>();
        for (Map.Entry<String, Double> entry : this.temperatures.getTemperatures().entrySet()){
            list.add(entry.getValue());
        }
        Collections.sort(list);
        if(this.temperatures.getTemperatures().size() % 2 != 0){
            int finalIndex = ((list.size() + 1)/2) - 1;
            return list.get(finalIndex);
        }
        else{
            double med1 = list.get(list.size()/2-1);
            double med2 = list.get((list.size()/2));
            double mean = (med1 + med2)/2;
            return mean;
        }
    }

}