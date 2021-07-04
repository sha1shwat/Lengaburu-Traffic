package com.geektrust.enums;

import com.geektrust.data.Vehicle;

import java.util.Map;

public enum VehicleInfo {

    BIKE("Bike",10,2),
    TUKTUK("TUKTUK",12,1),
    SUPERCAR("CAR",20,3);

    public String vehicleType;
    public Integer maxSpeedInMegaMilesPerHour;
    public Integer timeToCrossCraterInMinute;

    VehicleInfo(String vehicleType, Integer maxSpeed, Integer timeToCrossCrater) {
        this.vehicleType = vehicleType;
        this.maxSpeedInMegaMilesPerHour = maxSpeed;
        this.timeToCrossCraterInMinute = timeToCrossCrater;
    }

    private Map<String, Vehicle> vehicleDetailsMap;

    public Map<String,Vehicle> getVehicleDetailsMap(){

        for(VehicleInfo v: VehicleInfo.values()){

            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleType(v.vehicleType);
            vehicle.setMaxVehicleSpeed(v.maxSpeedInMegaMilesPerHour);
            vehicle.setTimeToCrossACrater(v.timeToCrossCraterInMinute);

              vehicleDetailsMap.put(v.name(),vehicle);
        }
        return vehicleDetailsMap;
    }
}
