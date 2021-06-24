package com.geektrust.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum WeatherVehicle {

    RAINY("RAINY", Arrays.asList("SUPERCAR", "TUKTUK")),
    SUNNY("SUNNY",Arrays.asList());


    public String weatherType;
    public List<String> allowedVehicles;

    WeatherVehicle(String weatherType, List<String> allowedVehicles) {
        this.weatherType = weatherType;
        this.allowedVehicles = allowedVehicles;
    }
}
