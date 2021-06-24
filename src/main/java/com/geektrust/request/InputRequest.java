package com.geektrust.request;

public class InputRequest {

    String weatherCondition;
    Integer firstOrbitSpeed;
    Integer secondOrbitSpeed;

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public void setFirstOrbitSpeed(Integer firstOrbitSpeed) {
        this.firstOrbitSpeed = firstOrbitSpeed;
    }

    public void setSecondOrbitSpeed(Integer secondOrbitSpeed) {
        this.secondOrbitSpeed = secondOrbitSpeed;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public Integer getFirstOrbitSpeed() {
        return firstOrbitSpeed;
    }

    public Integer getSecondOrbitSpeed() {
        return secondOrbitSpeed;
    }
}
