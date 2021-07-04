package com.geektrust.enums;

import com.geektrust.data.Vehicle;
import com.geektrust.data.Weather;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum WeatherInfo {

    RAINY("RAINY",20, Arrays.asList("CAR", "TUKTUK")),
    SUNNY("SUNNY",-10,Arrays.asList("BIKE","CAR","TUKTUK")),
    WINDY("WINDY",0,Arrays.asList("BIKE","CAR"));


    public String weatherType;
    private Integer percentageIncreaseInCraters;
    public List<String> allowedVehicles;

    WeatherInfo(String weatherType,Integer percentageIncreaseInCraters, List<String> allowedVehicles) {
        this.weatherType = weatherType;
        this.allowedVehicles = allowedVehicles;
        this.percentageIncreaseInCraters = percentageIncreaseInCraters;
    }

    public final Map<String,Weather> weatherAllowedVehicleMap = new HashMap<>();

    public Map<String,Weather> getWeatherAllowedVehicleMap(){

        for(WeatherInfo w: WeatherInfo.values()){
            Weather weather = new Weather(w.weatherType,w.percentageIncreaseInCraters,w.allowedVehicles);
            weatherAllowedVehicleMap.put(w.name(),weather);
        }

        return weatherAllowedVehicleMap;
    }


}
