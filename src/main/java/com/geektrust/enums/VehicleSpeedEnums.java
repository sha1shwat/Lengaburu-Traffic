package com.geektrust.enums;

public enum VehicleSpeedEnums {

    BIKE("Bike",10,2),
    TUKTUK("TUKTUK",12,1),
    SUPERCAR("CAR",20,3);

    public String vehicleType;
    public Integer maxSpeedInMegaMilesPerHour;
    public Integer timeToCrossCraterInMinute;

    VehicleSpeedEnums(String vehicleType, Integer maxSpeed, Integer timeToCrossCrater) {
        this.vehicleType = vehicleType;
        this.maxSpeedInMegaMilesPerHour = maxSpeed;
        this.timeToCrossCraterInMinute = timeToCrossCrater;
    }
}
